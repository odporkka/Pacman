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
public class PisteTest {
    
    Piste p;
    
    public PisteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.p = new Piste();
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
        p.syodaan();
        assertEquals(true, p.syoty);
    }

    @Test
    public void testOnkoSyoty() {
        boolean x = p.onkoSyoty();
        assertEquals(false, x);
    }
    
}
