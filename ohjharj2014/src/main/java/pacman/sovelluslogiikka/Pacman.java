package pacman.sovelluslogiikka;

/**
 * Pelaajan ohjaama hahmo Pacman.
 */
public class Pacman {

    int x;
    int y;
    boolean immuuni;
    char seuraavaSuunta;
    char nykyinenSuunta;

    public Pacman() {
        this.x = 60;
        this.y = 150;
        this.nykyinenSuunta = 'a';
        this.seuraavaSuunta = 'a';
    }

    public void asetaSuunta(char suunta) {
        if (suunta == 'y') {
//            this.y--;
            this.seuraavaSuunta = 'y';
        } else if (suunta == 'a') {
//            this.y++;
            this.seuraavaSuunta = 'a';
        } else if (suunta == 'v') {
//            this.x--;
            this.seuraavaSuunta = 'v';
        } else if (suunta == 'o') {
//            this.x++;
            this.seuraavaSuunta = 'o';
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void annaImmunity() {

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void liiku(char suunta) {
        if (suunta == 'y') {
            this.y-=1;
        } else if (suunta == 'a') {
            this.y+=1;
        } else if (suunta == 'v') {
            this.x-=1;
        } else if (suunta == 'o') {
            this.x+=1;
        }
    }

}
