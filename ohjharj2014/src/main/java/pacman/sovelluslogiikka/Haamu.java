package pacman.sovelluslogiikka;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 * Luokka haamu-olioita varten. Haamut seuraavat Pacmania ja yrittavat syoda
 * taman.
 */
public class Haamu {

    int x;
    int y;
    private static Random r = new Random();
    private Suunta nykyinenSuunta;
    private BufferedImage img;

    /**
     * Luo haamun ja asettaa sijainnin parametrien mukaan. Hakee myös kuvan
     * haamun piirtamista varten ja asettaa aloitussuunnan.
     * 
     * @param x
     * @param y 
     */
    public Haamu(int x, int y) {
        this.x = x;
        this.y = y;
        this.nykyinenSuunta = Suunta.YLOS;
        
        try {
            this.img = ImageIO.read(getClass().getClassLoader().getResource("haamu.png"));
        } catch (IOException e) {
        }
    }

    /**
     * Liikuttaa haamua parametrina annettuun suuntaan.
     * 
     * @param s 
     */
    public void liiku(Suunta s) {
        if (s == Suunta.YLOS) {
            this.y -= 1;
        } else if (s == Suunta.ALAS) {
            this.y += 1;
        } else if (s == Suunta.VASEN) {
            if (x - 1 < -28) {
                this.setX(360);
            }
            this.x -= 1;

        } else if (s == Suunta.OIKEA) {
            if (x + 1 > 359) {
                this.setX(-30);
            }
            this.x += 1;

        }
    }
    
    /**
     * Arpoo seuraavan suunnan.
     * @return Seuraava suunta
     */
    public Suunta getSeuraavaSuunta() {
        int seuraava = r.nextInt(4);

        if (seuraava == 0) {
            return Suunta.YLOS;
        } else if (seuraava == 1) {
            return Suunta.ALAS;
        } else if (seuraava == 2) {
            return Suunta.VASEN;
        } else if (seuraava == 3) {
            return Suunta.OIKEA;
        }
        return null;
    }
    
    /**
     * Palauttaa monikulmion, jonka avulla lasketaan osuuko haamu Pacmaniin.
     * @return Monikulmio haamun sijainnin mukaan
     */
    public Rectangle getBounds(){
        return new Rectangle(x+5, y+5, 20, 20);
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

    public Suunta getNykyinenSuunta() {
        return nykyinenSuunta;
    }

    public void setNykyinenSuunta(Suunta uusiSuunta) {
        this.nykyinenSuunta = uusiSuunta;
    }

    public BufferedImage getImg() {
        return img;
    }   
}
