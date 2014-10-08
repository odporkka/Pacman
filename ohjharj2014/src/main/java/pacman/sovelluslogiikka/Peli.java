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
    
    public void etene(){
        liikutaPacmania();
    }

    private void liikutaPacmania() {
        int x_jako = pacman.getX() % 30;
        int y_jako = pacman.getY() % 30; 
        
        if (x_jako == 0 && y_jako == 0){
            pacman.nykyinenSuunta = pacman.seuraavaSuunta;
        }
        
        pacman.liiku(pacman.nykyinenSuunta);
    }
    
}
