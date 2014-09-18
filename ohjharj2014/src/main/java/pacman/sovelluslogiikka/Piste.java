package pacman.sovelluslogiikka;

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
