package pacman.kayttoliittyma;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import pacman.sovelluslogiikka.Peli;

/**
 * GameWindow pitaa sisallaan peli-olion ja hoitaa sen hetkisen pelitilanteen
 * piirtamisen.
 */

public class GameWindow extends JPanel {

    private final Peli peli;

    public GameWindow(Peli p) {
        this.setBackground(Color.LIGHT_GRAY);
        this.setMaximumSize(new Dimension(360, 330));
        this.setMinimumSize(new Dimension(360, 330));
        this.peli = p;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(peli.getPacman().getX(), peli.getPacman().getY(), 30, 30);
    }

    
}
