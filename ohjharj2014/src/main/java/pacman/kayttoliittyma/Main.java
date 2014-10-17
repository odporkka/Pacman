package pacman.kayttoliittyma;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;
import pacman.sovelluslogiikka.Peli;

/**
 * Main-metodi, joka hoitaa ohjelman kaynnistyksen ja sisaltaa loopin
 * pelitapahtumien ja näkymän päivittämiseen.
 */
public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();        
        final Peli peli = new Peli();
        final MainWindow window = new MainWindow(peli);
        SwingUtilities.invokeLater(window);
        
        
        
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
