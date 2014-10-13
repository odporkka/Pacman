package pacman.kayttoliittyma;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import pacman.sovelluslogiikka.Peli;
import pacman.sovelluslogiikka.Piste;
import pacman.sovelluslogiikka.Ruutu;
import pacman.sovelluslogiikka.Grid;
import pacman.sovelluslogiikka.Haamu;

/**
 * GameWindow pitaa sisallaan peli-olion ja hoitaa sen hetkisen pelitilanteen
 * piirtamisen.
 */
public class GameWindow extends JPanel {

    private final Peli peli;
    private BufferedImage img;

    public GameWindow(Peli p) {

        this.setMaximumSize(new Dimension(360, 330));
        this.setMinimumSize(new Dimension(360, 330));
        this.peli = p;
        setBackground(Color.LIGHT_GRAY);
        ClassLoader classLoader = getClass().getClassLoader();

        try {
            img = ImageIO.read(getClass().getClassLoader().getResource("pacman-map.png"));
        } catch (IOException e) {
            System.out.println("kuvaa ei löydy!");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        setDoubleBuffered(true);
        g2.drawImage(img, 0, 0, null);
//        g2.setColor(Color.black);
//        g2.fillOval(peli.getPacman().getX() + 1, peli.getPacman().getY() + 1, 29, 29);
//        g2.setColor(Color.yellow);
//        g2.fillOval(peli.getPacman().getX() + 3, peli.getPacman().getY() + 3, 25, 25);
        g2.drawImage(peli.getPacman().getImage(), peli.getPacman().getX(), peli.getPacman().getY(), null);
        piirraPisteet(g2);
        piirraHaamut(g2);
    }

    private void piirraPisteet(Graphics g) {
        Grid l = peli.getLauta();
        ArrayList<ArrayList<Ruutu>> x = l.getRuudut();
        g.setColor(Color.black);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 11; j++) {
                if (x.get(i).get(j) != null) {
                    if (x.get(i).get(j).getSisalto().onkoSyoty() == false) {
                        g.fillOval((i * 30) + 13, (j * 30) + 13, 5, 5);
                    }
                }
            }
        }
    }

    private void piirraHaamut(Graphics g2) {
        for (Haamu h : peli.getHaamut()) {
            g2.drawImage(h.getImg(), h.getX(), h.getY(), null);
        }
    }
}
