package pacman.kayttoliittyma;

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacman.sovelluslogiikka.Peli;

public class MainWindowTest {
    
    MainWindow mw;
    
    public MainWindowTest() {
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
        this.mw = new MainWindow(p);
        mw.run();
    }
    
    @After
    public void tearDown() {
    }

//    @Test
//    public void onkoFrameLuotu() {
//        boolean onkoOlemassa = (this.mw.getFrame() == null);
//        assertEquals(null, onkoOlemassa);
//    }

//    @Test
//    public void testGetFrame() {
//        System.out.println("getFrame");
//        MainWindow instance = null;
//        JFrame expResult = null;
//        JFrame result = instance.getFrame();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
    
}
