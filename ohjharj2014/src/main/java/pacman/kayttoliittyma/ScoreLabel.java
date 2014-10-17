package pacman.kayttoliittyma;

import javax.swing.JLabel;
import pacman.sovelluslogiikka.Ruudukko;

/**
 *Luokka pisteiden nayttamista varten.
 */
public class ScoreLabel extends JLabel{
    
    private final Ruudukko g;
    private final String s;
    private final String s2;

    /**
     * Luo JLabelin pistetilanteen nayttamista varten. Lisaa nykyisen pelin
     * ruudukon attribuutiksi pisteiden haun takia.
     * @param g 
     */
    public ScoreLabel(Ruudukko g) {
        super("Score: ");
        this.s = "Score: ";        
        this.g = g;
        this.s2 = "Level: ";
        this.setAlignmentX(RIGHT);       
    }
   
    /**
     * Paivittaa pistetilanteen.
     */
    public void paivita(){
        this.setText(s+g.getKokonaisPisteet()+"   "+s2+g.getLevel());
    }
    
}
