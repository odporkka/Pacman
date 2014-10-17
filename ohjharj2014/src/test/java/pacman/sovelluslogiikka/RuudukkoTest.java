package pacman.sovelluslogiikka;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuudukkoTest {

    Ruudukko g;

    public RuudukkoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        g = new Ruudukko();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pisteetAlussaNolla() {
        assertEquals(0, g.getTotalScore());
    }

    @Test
    public void taulukkoOlemassa() {
        boolean onOlemassa = false;
        if (g.getRuudut() != null) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }
    
    @Test
    public void taulukkoOikeanKokoinen() {
        int leveys= 12;
        int korkeus=11;
        int yht=leveys+korkeus;
        ArrayList<ArrayList<Ruutu>> r = g.getRuudut();
        int taulukonKoko=r.size() + r.get(0).size();
        System.out.println(r.size());
        System.out.println(r.get(0).size());
        assertEquals(yht, taulukonKoko);
    }
}
