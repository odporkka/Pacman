package pacman.kayttoliittyma;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Luokka NewGame-nappia varten.
 */

public class NewGameButton extends JButton implements ActionListener{

    public NewGameButton() {
        this.setPreferredSize(new Dimension(350, 75));
        this.setText("New Game!");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
