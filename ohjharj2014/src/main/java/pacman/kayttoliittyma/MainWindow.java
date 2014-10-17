package pacman.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import pacman.sovelluslogiikka.Peli;

/**
 * Kayttoliittyman paaikkuna joka pitaa sisallaan kaikki pelin elementit
 * (kayttoliittyman osat ja peli-olion).
 */
public class MainWindow extends JFrame implements Runnable {

    private JFrame frame;
    private GameWindow gw;
    private NewGameButton ngb;
    private KeyBoardListener kbl;
    private ScoreLabel sl;
    private final Peli p;

    /**
     * Luo ikkunan ja asettaa pelin attribuutiksi.
     * @param peli 
     */
    MainWindow(Peli peli) {
        this.p = peli;
    }
    
    /**
     * Metodi pelitilanteen uudelleen piirtamista varten. Paivittaa peli-ikkunan
     * ja piste-paneelin.
     */
    public void paivita() {
        this.gw.repaint();
        this.sl.paivita();
    }

    @Override
    public void run() {
        frame = new JFrame("Pacman");
        frame.setPreferredSize(new Dimension(500, 400));
        frame.setResizable(false);
        frame.setLocation(400, 250);
        frame.setLayout(new BoxLayout(frame.getContentPane(), Y_AXIS));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setFocusable(true);
        frame.setVisible(true);
    }

    /**
     * Luo paaikkunan komponentit. Lisaa Peli-ikkunan, NewGame-buttonin, 
     * Pistepaneelim ja asettaa kuuntelijat.
     * @param contentPane 
     */
    private void createComponents(Container contentPane) {
        this.gw = new GameWindow(this.p);
        this.ngb = new NewGameButton(this.p);
        this.kbl = new KeyBoardListener(p.getPacman(), p);
        this.sl = new ScoreLabel(this.p.getLauta());
        
        frame.add(ngb);
        frame.add(gw);
        frame.addKeyListener(kbl);
        frame.add(sl);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
