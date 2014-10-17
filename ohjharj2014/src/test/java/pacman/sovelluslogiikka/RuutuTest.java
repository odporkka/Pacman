package pacman.sovelluslogiikka;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuutuTest {

    Ruutu r;
    Random ran;

    public RuutuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.r = new Ruutu();
        this.ran = new Random();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testaaKonstruktori() {
        boolean x = false;
        if (r.getSisalto() != null) {
            x = true;
        }
        assertEquals(true, x);
    }

    @Test
    public void testSetSisalto() {
        Piste p = new Piste();
        r.setSisalto(p);
        assertEquals(p, r.getSisalto());
    }

    @Test
    public void testVaihdaPisteHedelmaan() {
        Hedelma h = new Hedelma();
        r.vaihdaPisteHedelmaan(h);
        assertEquals(h, r.getSisalto());
    }
}
