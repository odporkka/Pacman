package pacman.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public MainWindow(Peli p) {
        this.p = p;
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

    private void createComponents(Container contentPane) {
        this.gw = new GameWindow(this.p);
        this.ngb = new NewGameButton();
        this.kbl = new KeyBoardListener(p.getPacman(), frame.getContentPane());
        this.sl = new ScoreLabel(this.p.getLauta());
        
        frame.add(ngb);
        frame.add(gw);
        frame.addKeyListener(kbl);
        frame.add(sl);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void paivita() {
        if(this.gw == null){
            System.out.println("wtf!");
        }
        this.gw.repaint();
        this.sl.paivita();
    }
}
