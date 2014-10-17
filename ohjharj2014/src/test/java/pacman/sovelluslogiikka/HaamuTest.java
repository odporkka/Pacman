/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacman.sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author odporkka
 */
public class HaamuTest {
    
    Haamu h;
    
    public HaamuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h = new Haamu(90, 150);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testLiiku(){
        boolean liikkuiko = true;
        
        int y = h.getY();
        h.liiku(Suunta.YLOS);
        if (y<=h.getY()){
            liikkuiko = false;
        }
        int y2 = h.getY();
        h.liiku(Suunta.ALAS);
        if (y2>=h.getY()){
            liikkuiko = false;
        }
        int x = h.getX();
        h.liiku(Suunta.VASEN);
        if (x<=h.getX()){
            liikkuiko = false;
        }
        int x2 = h.getX();
        h.liiku(Suunta.OIKEA);
        if (x2>=h.getX()){
            liikkuiko = false;
        }
        assertEquals(true, liikkuiko);
    }
    
    @Test
    public void testaaGetSeuraava(){
        Suunta s = h.getSeuraavaSuunta();
        boolean toimiko = false;
        if (s == Suunta.YLOS) toimiko = true;
        if (s == Suunta.ALAS) toimiko = true;
        if (s == Suunta.OIKEA) toimiko = true;
        if (s == Suunta.VASEN) toimiko = true;
        assertEquals(true, toimiko);
    }
    
}
