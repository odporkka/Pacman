package pacman.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pacman.sovelluslogiikka.Peli;

/**
 *Kuuntelija NewGame-nappia varten.
 * @author odporkka
 */
public class NewGameListener implements ActionListener{
    
    private Peli p;

    /**
     * Luo kuuntelijan ja asettaa nykyisen pelin attribuutiksi.
     * @param p 
     */
    public NewGameListener(Peli p) {
        this.p = p;
    }

    /**
     * Aloittaa uuden pelin nappia painettaessa.
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        p.newGame();
    }
    
}
