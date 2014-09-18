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
    public void pisteAlkioidenLuonti() {
        boolean onOlemassa = false;
        if (g.ruudut != null) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }
}
