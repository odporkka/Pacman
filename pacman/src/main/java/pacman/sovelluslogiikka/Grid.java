// pelilauta ja sen sisaltamat komponentit
package pacman.sovelluslogiikka;

import java.util.ArrayList;

public class Grid {
ArrayList<Piste> laudanPisteAlkiot;
int pisteet;
ArrayList<Hedelma> hedelmat;

    public Grid() {
        this.laudanPisteAlkiot = luoPisteAlkiot();
        this.pisteet = 0;
        this.hedelmat = luoHedelmat();
    }

    private ArrayList<Piste> luoPisteAlkiot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Hedelma> luoHedelmat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
