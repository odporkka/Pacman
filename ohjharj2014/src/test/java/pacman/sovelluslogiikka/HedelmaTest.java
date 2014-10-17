/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacman.sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author odporkka
 */
public class HedelmaTest {
    Hedelma h;
    
    public HedelmaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h = new Hedelma();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        assertEquals(1, 1);
    }
    
    @Test
    public void testSyodaan() {
        h.syodaan();
        assertEquals(true, h.syoty);
    }
    
    @Test
    public void annaImmunity() {
        Pacman p = new Pacman();
        h.syodaan(p);
        assertEquals(true, p.getImmuuni());
    }
}
