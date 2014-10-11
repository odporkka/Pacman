package pacman.kayttoliittyma;

import javax.swing.JLabel;
import pacman.sovelluslogiikka.Grid;

/**
 *
 * @author odporkka
 */

public class ScoreLabel extends JLabel{
    
    Grid g;
    String s;

    public ScoreLabel(Grid g) {
        super("Score: ");
        this.s = "Score: ";        
        this.g = g;
        
    }
   
    public void paivita(){
        this.setText(s+g.getTotalScore());
    }
    
}
