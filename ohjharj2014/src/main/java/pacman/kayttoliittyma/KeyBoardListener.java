package pacman.kayttoliittyma;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import pacman.sovelluslogiikka.Pacman;
import pacman.sovelluslogiikka.Peli;
import pacman.sovelluslogiikka.Suunta;

/**
 * Luokka nappaimiston kuuntelijaa varten.
 */
public class KeyBoardListener implements KeyListener {

    private final Peli peli;
    private final Pacman p;

    /**
     * Luo kuuntelijan ja asettaa pacmanin ja pelin attribuuteiksi.
     *
     * @param p
     * @param peli
     */
    public KeyBoardListener(Pacman p, Peli peli) {
        this.p = p;
        this.peli = peli;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    /**
     * Asettaa Pacmanin suunnan nuolinappaimia painettaessa, seka aloittaa uuden
     * pelin painettaessa F2.
     *
     * @param ke Painettu nappain
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            p.asetaSuunta(Suunta.VASEN);
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            p.asetaSuunta(Suunta.OIKEA);
        } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            p.asetaSuunta(Suunta.YLOS);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            p.asetaSuunta(Suunta.ALAS);
        } else if (ke.getKeyCode() == KeyEvent.VK_F2) {
            peli.newGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
