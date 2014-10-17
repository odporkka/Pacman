package pacman.sovelluslogiikka;

import java.util.ArrayList;

/**
 * Peli-olio sisaltaa sisallaan kaikki sovelluslogiikan komponenetit ja hoitaa
 * itse pelin pyorittamisen.
 */
public class Peli {

    private final Ruudukko ruudukko;
    private final Pacman pacman;
    private final ArrayList<Haamu> haamut;

    /**
     * Konstruktori Peli-luokalle. Luo ruudukon, Pacmanin ja haamut.
     */
    public Peli() {
        this.ruudukko = new Ruudukko();
        this.pacman = new Pacman();
        this.haamut = luoHaamut();
    }

    /**
     * Metodi pelin etenemista varten. Suorittaa yhden askeleen pelissa, eli
     * liikuttaa Pacmania ja haamuja seka nollaa pisteet ja kentan jos haamut
     * osuvat Pacmaniin.
     */
    public void etene() {
        liikutaPacmania();
        for (Haamu haamu : haamut) {
            liikutaHaamua(haamu);
        }
        if (pacman.getImmuuni() == false && osuukoHaamu()) {
            newGame();
        }
    }

    /**
     *Metodi uutta pelia varten. Nollaa tason ja pisteet.
     */
    public void newGame() {
        this.newLevel();
        this.ruudukko.nollaaPisteet();
    }

    /**
     * Metodi tason nollaamiseen. Ei nollaa pisteita eli jos Pacman saa kaikki
     * tason pisteet syotya tata metodia kutsutaan.
     */
    public void newLevel() {
        this.pacman.resetPosition();
        resetoiRuudut(ruudukko.getRuudut());
        resetoiHaamut();
        ruudukko.seuraavaTaso();
    }

    public Pacman getPacman() {
        return pacman;
    }

    public ArrayList<Haamu> getHaamut() {
        return haamut;
    }

    public Ruudukko getLauta() {
        return this.ruudukko;
    }

    private void syo(Ruutu r) {
        if (r != null) {
            Piste p = r.getSisalto();
            if (p.onkoSyoty() == false) {
                this.ruudukko.lisaaScore(p.syodaan());
            }
        }
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

    private void liikutaHaamua(Haamu h) {
        int x = h.getX() / 30;
        int y = h.getY() / 30;

        int x_jako = h.getX() % 30;
        int y_jako = h.getY() % 30;

        if (x_jako == 0 && y_jako == 0) {
            Ruutu r = ruudukko.getRuudut().get(x).get(y);

            if (r.saakoLiikkua(h.getNykyinenSuunta())) {
                h.liiku(h.getNykyinenSuunta());
            } else {
                while (true) {
                    Suunta s = h.getSeuraavaSuunta();
                    if (r.saakoLiikkua(s)) {
                        h.setNykyinenSuunta(s);
                        h.liiku(h.getNykyinenSuunta());
                        break;
                    }
                }
            }

        } else {
            h.liiku(h.getNykyinenSuunta());
        }
    }

    private void resetoiHaamut() {
        this.haamut.get(0).setX(5 * 30);
        this.haamut.get(0).setY(5 * 30);
        this.haamut.get(1).setX(6 * 30);
        this.haamut.get(1).setY(5 * 30);
        this.haamut.get(2).setX(6 * 30);
        this.haamut.get(2).setY(6 * 30);
    }

    private boolean osuukoHaamu() {
        for (Haamu haamu : haamut) {
            if (pacman.osuukoHaamu(haamu)) {
                return true;
            }
        }
        return false;
    }

    private ArrayList<Haamu> luoHaamut() {
        ArrayList<Haamu> x = new ArrayList<>();
        Haamu h1 = new Haamu(5 * 30, 5 * 30);
        Haamu h2 = new Haamu(6 * 30, 5 * 30);
        Haamu h3 = new Haamu(6 * 30, 6 * 30);
        x.add(h1);
        x.add(h2);
        x.add(h3);
        return x;
    }

    private void liikutaPacmania() {
        int x = pacman.getX() / 30;
        int y = pacman.getY() / 30;

        int x_jako = pacman.getX() % 30;
        int y_jako = pacman.getY() % 30;

        if (x_jako == 0 && y_jako == 0) {
            Ruutu r = ruudukko.getRuudut().get(x).get(y);
            syo(r);

            if (this.ruudukko.getKokonaisPisteet() % 1100 == 0) {
                this.newLevel();
                return;
            }

            if (r.saakoLiikkua(pacman.getSeuraavaSuunta())) {
                pacman.setNykyinenSuunta(pacman.getSeuraavaSuunta());
                pacman.liiku(pacman.getNykyinenSuunta());
            } else if (r.saakoLiikkua(pacman.getNykyinenSuunta())) {
                pacman.liiku(pacman.getNykyinenSuunta());
            } else {
            }
        } else {
            pacman.liiku(pacman.getNykyinenSuunta());
        }
    }
}
