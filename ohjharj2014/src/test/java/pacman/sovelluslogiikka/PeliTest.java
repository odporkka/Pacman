package pacman.sovelluslogiikka;

import pacman.sovelluslogiikka.Peli;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliTest {

    Peli p;

    public PeliTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p = new Peli();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void laudanLuonti() {
        boolean onOlemassa = false;
        if (p.getLauta() != null) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }

    @Test
    public void pacmaninLuonti() {
        boolean onOlemassa = false;
        if (p.getPacman() != null) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }

    @Test
    public void haamujenLuonti() {
        boolean onOlemassa = false;
        if (!p.getHaamut().isEmpty()) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }

    @Test
    public void testaaEtene() {
        boolean eteniko = false;

        Haamu h = p.getHaamut().get(0);
        int x = h.getX();
        int y = h.getY();
        p.etene();
        if (h.getX() != x || h.getY() != y) {
            eteniko = true;
        }

        assertEquals(true, eteniko);
    }

    @Test
    public void testaaNewGame() {
        boolean nollaantuiko = true;
        for (int i = 0; i < 10; i++) {
            p.etene();
        }
        p.newGame();
        if (p.getLauta().getLevel() != 1 || p.getLauta().getKokonaisPisteet() != 0) {
            nollaantuiko = false;
        }
        assertEquals(true, nollaantuiko);
    }

    @Test
    public void testaaNewLevel() {
        int level = p.getLauta().getLevel();
        for (int i = 0; i < 4; i++) {
            p.etene();
        }

        p.newLevel();
        int px = p.getPacman().getX();
        int py = p.getPacman().getY();

        boolean onnistuiko = true;

        if (p.getHaamut().get(0).getX() != 150 || p.getHaamut().get(0).getY() != 150) {
            onnistuiko = false;
        }
        if (p.getHaamut().get(1).getX() != 180 || p.getHaamut().get(1).getY() != 150) {
            onnistuiko = false;
        }
        if (p.getHaamut().get(2).getX() != 180 || p.getHaamut().get(2).getY() != 180) {
            onnistuiko = false;
        }
        if (px != 0 || py != 150) onnistuiko = false;
        
        assertEquals(true, onnistuiko);
    }
}
