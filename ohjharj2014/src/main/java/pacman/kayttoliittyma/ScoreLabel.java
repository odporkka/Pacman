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
    String s2;

    public ScoreLabel(Grid g) {
        super("Score: ");
        this.s = "Score: ";        
        this.g = g;
        this.s2 = "Level: ";
        this.setAlignmentX(RIGHT);       
    }
   
    public void paivita(){
        this.setText(s+g.getTotalScore()+"   "+s2+g.getLevel());
    }
    
}
