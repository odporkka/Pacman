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
    static Random r = new Random();
    char nykyinenSuunta;
    BufferedImage img;

    public Haamu(int x, int y) {
        this.x = x;
        this.y = y;
        this.nykyinenSuunta = 'y';
        
        try {
            this.img = ImageIO.read(getClass().getClassLoader().getResource("haamu.png"));
        } catch (IOException e) {
        }
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

    public char getSeuraavaSuunta() {
        int seuraava = r.nextInt(4);

        if (seuraava == 0) {
            return 'y';
        } else if (seuraava == 1) {
            return 'a';
        } else if (seuraava == 2) {
            return 'v';
        } else if (seuraava == 3) {
            return 'o';
        }
        return 'x';
    }

    public void setNykyinenSuunta(char uusiSuunta) {
        this.nykyinenSuunta = uusiSuunta;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x+5, y+5, 20, 20);
    }

    public BufferedImage getImg() {
        return img;
    }
    
    
}
