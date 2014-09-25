package pacman.sovelluslogiikka;

/**
 * Piste-luokan aliluokka Hedelma.
 * Pisteiden annon lisaksi antaa Pacmanille hetkellisen kyvyn syoda haamuja.
 */
public class Hedelma extends Piste {
    public Pacman pacman;

    public Hedelma() {
    }
    
    public void setPacman(Pacman p){
        this.pacman = p;
    }
    
    @Override
    public int syodaan() {
        this.syoty = true;
        pacman.annaImmunity();
        return 50;
    }
    
}
