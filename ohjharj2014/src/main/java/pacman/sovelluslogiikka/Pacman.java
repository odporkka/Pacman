package pacman.sovelluslogiikka;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Luokka pelaajan ohjaamaa hahmoa, Pacmania varten.
 */
public final class Pacman {

    private int x;
    private int y;
    private boolean immuuni;
    private Suunta seuraavaSuunta;
    private Suunta nykyinenSuunta;
    private BufferedImage ylos;
    private BufferedImage alas;
    private BufferedImage oikea;
    private BufferedImage vasen;

    /**
     * Konstruktori joka asettaa aloituspisteen ja suunnan, seka lataa
     * kuvat piirtamista varten.
     */
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
    
    /**
     * Asettaa Pacmanin aloituspisteeseen ja asettaa aloitussuunnan.
     */
    public void resetPosition(){
        this.setX(0);
        this.setY(150);
        this.nykyinenSuunta = Suunta.OIKEA;
        this.seuraavaSuunta = Suunta.OIKEA;
    }
    
    /**
     * Tekee Pacmanin immuuniksi haamuille.
     */
    public void annaImmunity() {
        this.immuuni = true;
    }
    
    /**
     * Asettaa kulkusuunnan parametrin mukaan.
     * @param s 
     */
    public void asetaSuunta(Suunta s) {
        if (s == Suunta.YLOS) {
            if (this.nykyinenSuunta == Suunta.ALAS) {
                this.nykyinenSuunta = Suunta.YLOS;
            }
            this.seuraavaSuunta = Suunta.YLOS;
        } else if (s == Suunta.ALAS) {
            if (this.nykyinenSuunta == Suunta.YLOS) {
                this.nykyinenSuunta = Suunta.ALAS;
            }
            this.seuraavaSuunta = Suunta.ALAS;
        } else if (s == Suunta.VASEN) {
            if (this.nykyinenSuunta == Suunta.OIKEA) {
                this.nykyinenSuunta = Suunta.VASEN;
            }
            this.seuraavaSuunta = Suunta.VASEN;
        } else if (s == Suunta.OIKEA) {
            if (this.nykyinenSuunta == Suunta.VASEN) {
                this.nykyinenSuunta = Suunta.OIKEA;
            }
            this.seuraavaSuunta = Suunta.OIKEA;
        }
    }
    
    /**
     * Liikuttaa Pacmania parametrin mukaiseen suuntaan. (Eli kasvattaa tai
     * vahentaa x ja y kordinaatteja)
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
     * Palauttaa kuvan pacmanin kulkusuunnan mukaisesti.
     * @return Haluttu kuva piirtamista  varten
     */
    public BufferedImage getImage() {
        BufferedImage i = null;
        if (nykyinenSuunta == Suunta.YLOS) {
            i = this.ylos;
        } else if (nykyinenSuunta == Suunta.ALAS) {
            i = this.alas;
        } else if (nykyinenSuunta == Suunta.OIKEA) {
            i = this.oikea;
        } else if (nykyinenSuunta == Suunta.VASEN) {
            i = this.vasen;
        }
        return i;
    }
    
    /**
     * Tarkistaa osuuko Pacman parametrina annettuun haamuun.
     * @param h Tarkastettava haamu
     * @return true jos osuu, false jos ei osu
     */
    public boolean osuukoHaamu(Haamu h){
        return h.getBounds().intersects(getBounds());
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
    
    public void setNykyinenSuunta(Suunta s) {
        this.nykyinenSuunta = s;
    }

    public Suunta getSeuraavaSuunta() {
        return seuraavaSuunta;
    }
    
    private Rectangle getBounds(){
        return new Rectangle(x+5, y+5, 20, 20);
    }

    boolean getImmuuni() {
        return this.immuuni;
    }
}
