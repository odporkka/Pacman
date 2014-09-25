package pacman.kayttoliittyma;

import javax.swing.SwingUtilities;
import pacman.sovelluslogiikka.Peli;

public class Main {

    public static void main(String[] args) {
           Peli peli = new Peli();
           MainWindow gamewindow = new MainWindow(peli);
           SwingUtilities.invokeLater(gamewindow);
    }
}
