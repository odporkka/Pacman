package pacman.sovelluslogiikka;

/**
 * Yksinkertainen luokka pisteitä varten. Sisaltaa tiedon onko piste jo syoty
 * ja metodin syomista varten.
 */

public class Piste {
    
    boolean syoty;

    public Piste() {
        this.syoty = false;
    }
    
    public int syodaan(){
        this.syoty = true;
        return 10;
    }
    
    public boolean onkoSyoty(){
        return this.syoty;
    }
}
