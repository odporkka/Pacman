package pacman.sovelluslogiikka;

/**
 * Luokka haamu-olioita varten.
 * Haamut seuraavat Pacmania ja yrittavat syoda taman.
 */
public class Haamu {
    
    int x;
    int y;

    public Haamu(int x, int y) {
        this.x =x;
        this.y =y;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
