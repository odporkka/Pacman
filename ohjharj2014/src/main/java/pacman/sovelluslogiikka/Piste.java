package pacman.sovelluslogiikka;

/**
 * Yksinkertainen luokka pisteitä varten. Sisaltaa tiedon onko piste jo syoty
 * ja metodin syomista varten.
 */
public class Piste {
    
    boolean syoty;
    private final int ansaitutPisteet = 10;

    /**
     * Luo pisteen ja asettaa sen syotavaksi.
     */
    public Piste() {
        this.syoty = false;
    }
    
    /**
     * Asettaa pisteen syodyksi ja palauttaa pisteita pisteen arvon mukaan.
     * 
     * @return Syomisesta ansaitut pisteet
     */
    public int syodaan(){
        this.syoty = true;
        return ansaitutPisteet;
    }
    
    /**
     * Palauttaa tiedon onko piste syotavissa.
     * @return true=voi syoda, false=on jo syoty
     */
    public boolean onkoSyoty(){
        return this.syoty;
    }
    
    /**
     * Asettaa pisteen uudestaan syotavaksi.
     */
    public void resetoi(){
        this.syoty = false;
    }
}
