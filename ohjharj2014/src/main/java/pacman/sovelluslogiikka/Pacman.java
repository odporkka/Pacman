package pacman.sovelluslogiikka;

public class Pacman {

    int x;
    int y;
    boolean immuuni;

    public Pacman() {
        this.x = 0;
        this.y = 0;
    }

    public void liiku(char suunta) {
        if (suunta == 'y'){
            this.y--;
        } else if (suunta == 'a'){
            this.y++;
        } else if (suunta == 'v'){
            this.x--;
        } else if (suunta == 'o'){
            this.x++;
        }
    }

    void annaImmunity() {
        
    }

}
