package pacman.kayttoliittyma;

import java.awt.Dimension;
import javax.swing.JButton;
import pacman.sovelluslogiikka.Peli;

/**
 * Luokka NewGame-nappia varten.
 */
public class NewGameButton extends JButton{   
    
    /**
     * Luo uuden napin uuden pelin kaynnistamista varten.
     * @param p Peli olio joka valitetaan kuuntelijalle.
     */
    public NewGameButton(Peli p) {
        this.setPreferredSize(new Dimension(350, 75));
        this.setText("New Game! (F2)");
        this.addActionListener(new NewGameListener(p));
        this.setFocusable(false);
        this.setAlignmentX(LEFT);
    }
}
