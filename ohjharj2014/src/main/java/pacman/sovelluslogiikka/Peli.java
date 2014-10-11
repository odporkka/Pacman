package pacman.sovelluslogiikka;

import java.util.ArrayList;

/**
 * Peli-olio sisaltaa sisallaan kaikki sovelluslogiikan komponenetit ja hoitaa
 * itse pelin pyorittamisen.
 */
public class Peli {

    private final Grid lauta;
    private final Pacman pacman;
    private final ArrayList<Haamu> haamut;
    

//Luodaan peli-olio, joka sisältää pelaajan (Pacman), pelilaudan ja haamut. 
    public Peli() {
        this.lauta = new Grid();
        this.pacman = new Pacman();
        this.haamut = luoHaamut();
    }

    private ArrayList<Haamu> luoHaamut() {
        ArrayList<Haamu> x = new ArrayList<>();
        Haamu h1 = new Haamu(5, 5);
        Haamu h2 = new Haamu(6, 5);
        Haamu h3 = new Haamu(6, 6);
        x.add(h1);
        x.add(h2);
        x.add(h3);
        return x;
    }

    public Pacman getPacman() {
        return pacman;
    }

    public ArrayList<Haamu> getHaamut() {
        return haamut;
    }

    public void etene() {
        liikutaPacmania();
    }

    private void liikutaPacmania() {
        int x = pacman.getX() / 30;
        int y = pacman.getY() / 30;

        int x_jako = pacman.getX() % 30;
        int y_jako = pacman.getY() % 30;

        if (x_jako == 0 && y_jako == 0) {
            Ruutu r = lauta.ruudut.get(x).get(y);
            syo(r);
            if (this.lauta.getTotalScore()%1100 == 0){
                this.newLevel();
                return;
            }
            if (r.saakoLiikkua(pacman.seuraavaSuunta)) {
                pacman.nykyinenSuunta = pacman.seuraavaSuunta;
                pacman.liiku(pacman.nykyinenSuunta);
            } else if (r.saakoLiikkua(pacman.nykyinenSuunta)) {
                pacman.liiku(pacman.nykyinenSuunta);
            } else {
            }
        } else {
            pacman.liiku(pacman.nykyinenSuunta);
        }
    }

    public Grid getLauta() {
        return this.lauta;
    }

    private void syo(Ruutu r) {
        if (r != null) {
            Piste p = r.getSisalto();
            if (p.onkoSyoty() == false) {
                this.lauta.lisaaScore(p.syodaan());
            }
        }
    }

    public void newGame() {
        this.newLevel();

        this.lauta.nollaaScore();
    }

    private void resetoiRuudut(ArrayList<ArrayList<Ruutu>> r) {
        for (ArrayList<Ruutu> arrayList : r) {
            for (Ruutu ruutu : arrayList) {
                if (ruutu != null) {
                    ruutu.getSisalto().resetoi();
                }
            }
        }
    }

    public void newLevel() {
        this.pacman.setX(60);
        this.pacman.setY(150);
        this.pacman.nykyinenSuunta = 'a';
        this.pacman.seuraavaSuunta = 'a';

        haamut.get(0).setX(5);
        haamut.get(1).setX(6);
        haamut.get(2).setX(6);
        haamut.get(0).setY(5);
        haamut.get(1).setY(5);
        haamut.get(2).setY(6);

        resetoiRuudut(lauta.getRuudut());
        lauta.nextLevel();
    }
}
