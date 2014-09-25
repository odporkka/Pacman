package pacman.sovelluslogiikka;

import java.util.ArrayList;

/**
 * Peli-olio sisaltaa sisallaan kaikki sovelluslogiikan komponenetit ja hoitaa
 * itse pelin pyorittamisen.
 */

public class Peli {
    Grid lauta;
    Pacman pacman;
    ArrayList<Haamu> haamut;
    
//Luodaan peli-olio, joka sisältää pelaajan (Pacman), pelilaudan ja haamut. 
    public Peli() {
        this.lauta = new Grid();
        this.pacman = new Pacman();
        this.haamut = luoHaamut();
    }

    private ArrayList<Haamu> luoHaamut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
