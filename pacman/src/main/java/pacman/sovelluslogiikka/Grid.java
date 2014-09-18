// pelilauta ja sen sisaltamat komponentit
package pacman.sovelluslogiikka;

import java.util.ArrayList;

public class Grid {

    ArrayList<ArrayList<Ruutu>> ruudut;
    int totalScore;
    Pacman pacman;
    ArrayList<Haamu> haamut;

    public Grid() {
        this.ruudut = luoRuudut();
        this.totalScore = 0;
    }

    private ArrayList<ArrayList<Ruutu>> luoRuudut() {
        //luodaan sarake kerrallaan, kentta on aina sama joten sen voi hardcodettaa
        //myoskin liikkumisrajoitteet olisi melko hankala generoida joten hardcode helpompaa
        ArrayList<Ruutu> sarake0 = luoSarake0();
        ArrayList<Ruutu> sarake1 = luoSarake1();
        ArrayList<Ruutu> sarake2 = luoSarake2();
        ArrayList<Ruutu> sarake3 = luoSarake3();
        ArrayList<Ruutu> sarake4 = luoSarake4();
        ArrayList<Ruutu> sarake5 = luoSarake5();
        ArrayList<Ruutu> sarake6 = luoSarake6();
        ArrayList<Ruutu> sarake7 = luoSarake7();
        ArrayList<Ruutu> sarake8 = luoSarake8();
        ArrayList<Ruutu> sarake9 = luoSarake9();
        ArrayList<Ruutu> sarake10 = luoSarake10();
        ArrayList<Ruutu> sarake11 = luoSarake11();

        //itse taulukko, array list array listin sisalla
        ArrayList<ArrayList<Ruutu>> x = new ArrayList<>();

        //lisataan sarakkeet, haettaessa ensimmainen arvo x kordinaatti ja toinen y
        //esim x.get(0).get(1) antaa taulukon toised ruudun (1 rivi 2 sarake)
        x.add(0, sarake0);
        x.add(1, sarake1);
        x.add(2, sarake2);
        x.add(3, sarake3);
        x.add(4, sarake4);
        x.add(5, sarake5);
        x.add(6, sarake6);
        x.add(7, sarake7);
        x.add(8, sarake8);
        x.add(9, sarake9);
        x.add(10, sarake10);
        x.add(11, sarake11);
        return x;
    }

    private ArrayList<Ruutu> luoSarake0() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(1).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(2).asetaSuuntaParametrit(1, 1, 0, 1);
        x.get(3).asetaSuuntaParametrit(1, 0, 0, 1);
        x.add(4, null);
        x.get(5).asetaSuuntaParametrit(0, 0, 0, 1);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(8).asetaSuuntaParametrit(1, 0, 0, 1);
        x.get(9).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(10).asetaSuuntaParametrit(1, 0, 0, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake1() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(1, null);
        x.get(2).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(3).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(4, null);
        x.get(5).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(8).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(9).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake2() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 1, 1, 1);
        x.get(1).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(2).asetaSuuntaParametrit(1, 1, 1, 1);
        x.get(3).asetaSuuntaParametrit(1, 1, 1, 0);
        x.get(4).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(5).asetaSuuntaParametrit(1, 1, 1, 1);
        x.get(6).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(7).asetaSuuntaParametrit(1, 1, 1, 1);
        x.get(8).asetaSuuntaParametrit(1, 1, 0, 1);
        x.get(9).asetaSuuntaParametrit(1, 0, 1, 0);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake3() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(1, null);
        x.get(2).asetaSuuntaParametrit(0, 1, 1, 1);
        x.get(3).asetaSuuntaParametrit(1, 0, 0, 1);
        x.get(4).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(5).asetaSuuntaParametrit(1, 1, 1, 0);
        x.get(6).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(7).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(8).asetaSuuntaParametrit(0, 1, 1, 1);
        x.get(9).asetaSuuntaParametrit(1, 0, 0, 1);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake4() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(1, null);
        x.get(2).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(3).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(4).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(5, null);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(8).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(9).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake5() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(1).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(2).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(3).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(4).asetaSuuntaParametrit(1, 0, 1, 1);
        x.add(5, null);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(8).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(9).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(10).asetaSuuntaParametrit(1, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake6() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(1).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(2).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(3).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(4).asetaSuuntaParametrit(1, 0, 1, 1);
        x.add(5, null);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(8).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(9).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(10).asetaSuuntaParametrit(1, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake7() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(1, null);
        x.get(2).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(3).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(4).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(5, null);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(8).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(9).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake8() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(1, null);
        x.get(2).asetaSuuntaParametrit(0, 1, 1, 1);
        x.get(3).asetaSuuntaParametrit(1, 0, 1, 0);
        x.get(4).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(5).asetaSuuntaParametrit(1, 1, 1, 0);
        x.get(6).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(7).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(8).asetaSuuntaParametrit(0, 1, 1, 1);
        x.get(9).asetaSuuntaParametrit(1, 0, 1, 0);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake9() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 1, 1, 1);
        x.get(1).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(2).asetaSuuntaParametrit(1, 1, 1, 1);
        x.get(3).asetaSuuntaParametrit(1, 1, 0, 1);
        x.get(4).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(5).asetaSuuntaParametrit(1, 1, 1, 1);
        x.get(6).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(7).asetaSuuntaParametrit(1, 1, 1, 1);
        x.get(8).asetaSuuntaParametrit(1, 1, 1, 0);
        x.get(9).asetaSuuntaParametrit(1, 0, 0, 1);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake10() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(1, null);
        x.get(2).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(3).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(4, null);
        x.get(5).asetaSuuntaParametrit(0, 0, 1, 1);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 0, 1, 1);
        x.get(8).asetaSuuntaParametrit(0, 1, 0, 1);
        x.get(9).asetaSuuntaParametrit(1, 0, 1, 1);
        x.get(10).asetaSuuntaParametrit(0, 0, 1, 1);
        return x;
    }

    private ArrayList<Ruutu> luoSarake11() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        x.get(0).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(1).asetaSuuntaParametrit(1, 1, 0, 0);
        x.get(2).asetaSuuntaParametrit(1, 1, 1, 0);
        x.get(3).asetaSuuntaParametrit(1, 0, 1, 0);
        x.add(4, null);
        x.get(5).asetaSuuntaParametrit(0, 0, 1, 0);
        x.add(6, null);
        x.get(7).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(8).asetaSuuntaParametrit(1, 0, 1, 0);
        x.get(9).asetaSuuntaParametrit(0, 1, 1, 0);
        x.get(10).asetaSuuntaParametrit(1, 0, 1, 0);
        return x;
    }

    //luodaan Ruutu oliot taulukkoon, Ruutu-olion konstruktori luo myos Piste-olion
    private void luoRuudut(ArrayList<Ruutu> x) {
        for (Ruutu ruutu : x) {
            ruutu = new Ruutu();
        }
    }
}
