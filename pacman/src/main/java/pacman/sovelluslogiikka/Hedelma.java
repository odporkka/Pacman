
package pacman.sovelluslogiikka;

public class Hedelma extends Piste {
    private final Pacman pacman;

    public Hedelma(Pacman pacman) {
        this.pacman = pacman;
    }
    

    @Override
    public int syodaan() {
        this.syoty = true;
        pacman.annaImmunity();
        return 50;
    }
    
}
