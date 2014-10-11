package pacman.sovelluslogiikka;

/**
 * Yksinkertainen luokka pisteitä varten. Sisaltaa tiedon onko piste jo syoty
 * ja metodin syomista varten.
 */

public class Piste {
    
    boolean syoty;
    private final int ansaitutPisteet = 10;

    public Piste() {
        this.syoty = false;
    }
    
    public int syodaan(){
        this.syoty = true;
        return ansaitutPisteet;
    }
    
    public boolean onkoSyoty(){
        return this.syoty;
    }
    
    public void resetoi(){
        this.syoty = false;
    }
}
