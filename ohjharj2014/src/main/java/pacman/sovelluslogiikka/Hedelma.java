package pacman.sovelluslogiikka;

/**
 * Piste-luokan aliluokka Hedelma.
 * Pisteiden annon lisaksi antaa Pacmanille hetkellisen kyvyn syoda haamuja.
 */
public class Hedelma extends Piste {

    /**
     * Luo Hedelman.
     */
    public Hedelma() {
        super();
    }
    
    /**
     * Asettaa hedelman syodyksi, antaa pacmanille kyvyn syoda haamuja ja 
     * palauttaa hedelmasta saadut pisteet.
     * @param p
     * @return pisteet
     */
        public int syodaan(Pacman p) {
        this.syoty = true;
        p.annaImmunity();
        return 10;
    }
    
    private void AnnaImmunity(Pacman p){
        p.annaImmunity();
    }
}
