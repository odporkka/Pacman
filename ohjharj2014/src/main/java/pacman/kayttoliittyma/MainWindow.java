package pacman.kayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.PAGE_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import pacman.sovelluslogiikka.Peli;

/**
 * Kayttoliittyman paaikkuna joka pitaa sisallaan kaikki pelin elementit
 * (kayttoliittyman osat ja peli-olion).
 */

public class MainWindow implements Runnable{

    private JFrame frame;
    private GameWindow gw;
    private NewGameButton ngb;
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
        frame.setVisible(true);
    }

    private void createComponents(Container contentPane) {
        this.gw = new GameWindow(this.p);
        
        frame.add(gw);
    }

    public JFrame getFrame() {
        return frame;
    }
}
