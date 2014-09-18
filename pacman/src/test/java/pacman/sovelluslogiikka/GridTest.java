package pacman.sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GridTest {

    Grid g;

    public GridTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        g = new Grid();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pisteetAlussaNolla() {
        assertEquals(0, g.totalScore);
    }

    @Test
    public void taulukkoOlemassa() {
        boolean onOlemassa = false;
        if (g.ruudut != null) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }
    
    @Test
    public void taulukkoOikeanKokoinen() {
        int leveys= 12;
        int korkeus=11;
        int yht=leveys+korkeus;
        int taulukonKoko=g.ruudut.size() + g.ruudut.get(0).size();
        assertEquals(yht, taulukonKoko);
    }
}
