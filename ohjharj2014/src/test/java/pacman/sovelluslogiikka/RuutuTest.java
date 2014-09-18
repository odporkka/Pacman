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
        if (r.sisalto != null) {
            x = true;
        }
        assertEquals(true, x);
    }

    @Test
    public void testSetX() {
        r.setX(5);
        assertEquals(5, r.x);
    }

    @Test
    public void testSetY() {
        r.setY(5);
        assertEquals(5, r.y);
    }

    @Test
    public void testSetSisalto() {
        Piste p = new Piste();
        r.setSisalto(p);
        assertEquals(p, r.sisalto);
    }
    
    @Test
    public void testGetSisalto() {
        assertEquals(r.sisalto, r.getSisalto());
    }

    @Test
    public void testVaihdaPisteHedelmaan() {
        Hedelma h = new Hedelma();
        r.vaihdaPisteHedelmaan(h);
        assertEquals(h, r.getSisalto());
    }

    @Test
    public void testGetYlos() {
        assertEquals(false, r.getYlos());
    }

    @Test
    public void testGetAlas() {
        assertEquals(false, r.getAlas());
    }

    @Test
    public void testGetVasemmalle() {
        assertEquals(false, r.getVasemmalle());
    }

    @Test
    public void testGetOikealle() {
        assertEquals(false, r.getOikealle());
    }

    @Test
    public void testAsetaSuuntaParametrit() {
        int a = ran.nextInt(2);
        int b = ran.nextInt(2);
        int c = ran.nextInt(2);
        int d = ran.nextInt(2);
        
        r.asetaSuuntaParametrit(a, b, c, d);
        boolean x = true;
        if (r.suunnat[0]!=a) x=false;
        if (r.suunnat[1]!=b) x=false;
        if (r.suunnat[2]!=c) x=false;
        if (r.suunnat[3]!=d) x=false;
        
        assertEquals(x, true);
        
    }

}
