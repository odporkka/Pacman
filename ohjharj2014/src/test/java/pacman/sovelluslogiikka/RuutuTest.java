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
    
    @Test
    public void testSaakoLiikkua(){
        boolean saako = false;
        if (r.saakoLiikkua(Suunta.YLOS)) saako = true;
        if (r.saakoLiikkua(Suunta.ALAS)) saako = true;
        if (r.saakoLiikkua(Suunta.OIKEA)) saako = true;
        if (r.saakoLiikkua(Suunta.VASEN)) saako = true;
        assertEquals(false, saako);
    }
    
    @Test
    public void testAsetaParametrit(){
        r.asetaSuuntaParametrit(1, 0, 1, 1);
        boolean x = true;
        if (!r.saakoLiikkua(Suunta.YLOS)) x = false;
        if (r.saakoLiikkua(Suunta.ALAS)) x = false;
        if (!r.saakoLiikkua(Suunta.OIKEA)) x = false;
        if (!r.saakoLiikkua(Suunta.VASEN)) x = false;
        assertEquals(true, x);
    }
    
    @Test
    public void testAsetaParametrit2(){
        r.asetaSuuntaParametrit(5, -5, 10, 150);
        boolean vaihtuikoParametrit = false;
        if (r.saakoLiikkua(Suunta.YLOS)){
            vaihtuikoParametrit = true;
        }
        if (r.saakoLiikkua(Suunta.ALAS)){
            vaihtuikoParametrit = true;
        }
        if (r.saakoLiikkua(Suunta.OIKEA)){
            vaihtuikoParametrit = true;
        }
        if (r.saakoLiikkua(Suunta.VASEN)){
            vaihtuikoParametrit = true;
        }
        assertEquals(false, vaihtuikoParametrit);
    }
}
