package pacman.kayttoliittyma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacman.sovelluslogiikka.Peli;

public class GameWindowTest {
    
    GameWindow g;
    
    public GameWindowTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Peli p = new Peli();
        this.g = new GameWindow(p);
    }
    
    @After
    public void tearDown() {
    }

//    @Test
//    public void testSomeMethod() {
//        fail("The test case is a prototype.");
//    }
//    
}