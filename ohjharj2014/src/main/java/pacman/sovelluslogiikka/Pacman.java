package pacman.sovelluslogiikka;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Pelaajan ohjaama hahmo Pacman.
 */
public final class Pacman {

    int x;
    int y;
    boolean immuuni;
    char seuraavaSuunta;
    char nykyinenSuunta;
    BufferedImage ylos;
    BufferedImage alas;
    BufferedImage oikea;
    BufferedImage vasen;

    public Pacman() {
       this.resetPosition();

        try {
            this.ylos = ImageIO.read(getClass().getClassLoader().getResource("Pacman_ylos.png"));
            this.alas = ImageIO.read(getClass().getClassLoader().getResource("Pacman_alas.png"));
            this.oikea = ImageIO.read(getClass().getClassLoader().getResource("Pacman_oikea.png"));
            this.vasen = ImageIO.read(getClass().getClassLoader().getResource("Pacman_vasen.png"));
        } catch (IOException e) {
        }
    }

    public void asetaSuunta(char suunta) {
        if (suunta == 'y') {
            if (this.nykyinenSuunta == 'a') {
                this.nykyinenSuunta = 'y';
            }
            this.seuraavaSuunta = 'y';
        } else if (suunta == 'a') {
            if (this.nykyinenSuunta == 'y') {
                this.nykyinenSuunta = 'a';
            }
            this.seuraavaSuunta = 'a';
        } else if (suunta == 'v') {
            if (this.nykyinenSuunta == 'o') {
                this.nykyinenSuunta = 'v';
            }
            this.seuraavaSuunta = 'v';
        } else if (suunta == 'o') {
            if (this.nykyinenSuunta == 'v') {
                this.nykyinenSuunta = 'o';
            }
            this.seuraavaSuunta = 'o';
        }
    }

    public BufferedImage getImage() {
        BufferedImage i = null;
        if (nykyinenSuunta == 'y') {
            i = this.ylos;
        } else if (nykyinenSuunta == 'a') {
            i = this.alas;
        } else if (nykyinenSuunta == 'o') {
            i = this.oikea;
        } else if (nykyinenSuunta == 'v') {
            i = this.vasen;
        }
        return i;
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
            this.y -= 1;
        } else if (suunta == 'a') {
            this.y += 1;
        } else if (suunta == 'v') {
            if (x - 1 < -28) {
                this.setX(360);
            }
            this.x -= 1;

        } else if (suunta == 'o') {
            if (x + 1 > 359) {
                this.setX(-30);
            }
                this.x += 1;
            
        }
    }

    public void resetPosition(){
        this.setX(0);
        this.setY(150);
        this.nykyinenSuunta = 'o';
        this.seuraavaSuunta = 'o';
    }
    
    private Rectangle getBounds(){
        return new Rectangle(x+5, y+5, 20, 20);
    }
    
    public boolean osuukoHaamu(Haamu h){
        return h.getBounds().intersects(getBounds());
    }
}
