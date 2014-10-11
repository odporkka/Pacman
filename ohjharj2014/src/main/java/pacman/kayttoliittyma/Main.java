package pacman.kayttoliittyma;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;
import pacman.sovelluslogiikka.Peli;

/**
 * Main-metodi, joka hoitaa ohjelman kaynnistyksen.
 *
 */
public class Main {

    public static void main(String[] args) {
        final Peli peli = new Peli();
        final MainWindow window = new MainWindow(peli);
        SwingUtilities.invokeLater(window);
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                peli.etene();
                window.paivita();
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 10);
        
    }
}
