package pacman.kayttoliittyma;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import pacman.sovelluslogiikka.Peli;

/**
 * GameWindow pitaa sisallaan peli-olion ja hoitaa sen hetkisen pelitilanteen
 * piirtamisen.
 */

public class GameWindow extends JPanel{
    
    private final Peli peli;

    public GameWindow(Peli p) {
        this.setBackground(Color.LIGHT_GRAY);
        this.peli = p;
    }
    
    
}
