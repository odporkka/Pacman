package pacman.kayttoliittyma;

import javax.swing.JLabel;
import pacman.sovelluslogiikka.Ruudukko;

/**
 *
 * @author odporkka
 */

public class ScoreLabel extends JLabel{
    
    Ruudukko g;
    String s;
    String s2;

    public ScoreLabel(Ruudukko g) {
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
