package pacman.kayttoliittyma;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import pacman.sovelluslogiikka.Peli;

/**
 * Main-metodi, joka hoitaa ohjelman kaynnistyksen.
 *
 */
public class Main {

    public static void main(String[] args) {
        Peli peli = new Peli();
        MainWindow window = new MainWindow(peli);
        SwingUtilities.invokeLater(window);
        
        
    }
}
