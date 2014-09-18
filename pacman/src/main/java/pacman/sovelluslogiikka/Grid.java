// pelilauta ja sen sisaltamat komponentit
package pacman.sovelluslogiikka;

import java.util.ArrayList;

public class Grid {

    ArrayList<ArrayList<Ruutu>> ruudut;
    int totalScore;

    public Grid() {
        this.ruudut = luoRuudut();
        this.totalScore = 0;
    }

    private ArrayList<ArrayList<Ruutu>> luoRuudut() {
        //luodaan rivi kerrallaan, kentta on aina sama joten sen voi hardcodettaa
        //myoskin liikkumisrajoitteet on melko hankala generoida joten hardcode helpompaa
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
        return x;
    }

    private ArrayList<Ruutu> luoSarake0() {
        ArrayList<Ruutu> x = new ArrayList<>(11);
        luoRuudut(x);
        
        return x;
    }

    private ArrayList<Ruutu> luoSarake1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake6() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake8() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake9() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Ruutu> luoSarake10() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void luoRuudut(ArrayList<Ruutu> x) {
        for (Ruutu ruutu : x) {
            ruutu = new Ruutu();
        }
    }
    
}
