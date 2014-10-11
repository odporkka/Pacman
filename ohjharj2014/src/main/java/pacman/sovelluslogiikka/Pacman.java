package pacman.sovelluslogiikka;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Pelaajan ohjaama hahmo Pacman.
 */
public class Pacman {

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
        this.x = 60;
        this.y = 150;
        this.nykyinenSuunta = 'a';
        this.seuraavaSuunta = 'a';
        
        try {
            this.ylos = ImageIO.read(new File(
                    "/home/odporkka/Pacmanrepo/ohjharj2014/src/main/resources/Pacman_ylos.png"));
            this.alas = ImageIO.read(new File(
                    "/home/odporkka/Pacmanrepo/ohjharj2014/src/main/resources/Pacman_alas.png"));
            this.oikea = ImageIO.read(new File(
                    "/home/odporkka/Pacmanrepo/ohjharj2014/src/main/resources/Pacman_oikea.png"));
            this.vasen = ImageIO.read(new File(
                    "/home/odporkka/Pacmanrepo/ohjharj2014/src/main/resources/Pacman_vasen.png"));
        } catch (IOException e) {
        }
    }

    public void asetaSuunta(char suunta) {
        if (suunta == 'y') {
            if (this.nykyinenSuunta == 'a'){
                this.nykyinenSuunta = 'y';
            }
            this.seuraavaSuunta = 'y';
        } else if (suunta == 'a') {
            if (this.nykyinenSuunta == 'y'){
                this.nykyinenSuunta = 'a';
            }
            this.seuraavaSuunta = 'a';
        } else if (suunta == 'v') {
            if (this.nykyinenSuunta == 'o'){
                this.nykyinenSuunta = 'v';
            }
            this.seuraavaSuunta = 'v';
        } else if (suunta == 'o') {
            if (this.nykyinenSuunta == 'v'){
                this.nykyinenSuunta = 'o';
            }
            this.seuraavaSuunta = 'o';
        }
    }
    
    public BufferedImage getImage(){
        BufferedImage i = null;
        if (nykyinenSuunta == 'y'){
            i = this.ylos;
        }
        else if (nykyinenSuunta == 'a'){
            i = this.alas;
        }
        else if (nykyinenSuunta == 'o'){
            i = this.oikea;
        }
        else if (nykyinenSuunta == 'v'){
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
