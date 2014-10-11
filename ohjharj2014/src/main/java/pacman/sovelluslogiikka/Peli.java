package pacman.sovelluslogiikka;

import java.util.ArrayList;

/**
 * Peli-olio sisaltaa sisallaan kaikki sovelluslogiikan komponenetit ja hoitaa
 * itse pelin pyorittamisen.
 */
public class Peli {

    private Grid lauta;
    private Pacman pacman;
    private ArrayList<Haamu> haamut;

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
            if (r.saakoLiikkua(pacman.seuraavaSuunta)) {
                pacman.nykyinenSuunta = pacman.seuraavaSuunta;
                pacman.liiku(pacman.nykyinenSuunta);
            } else if (r.saakoLiikkua(pacman.nykyinenSuunta)){
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
        if (r != null){
            Piste p = r.getSisalto();
            if (p.onkoSyoty()== false){
                this.lauta.totalScore += p.syodaan();
            }
        }      
    }
}
