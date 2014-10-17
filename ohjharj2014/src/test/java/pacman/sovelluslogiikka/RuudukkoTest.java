package pacman.sovelluslogiikka;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuudukkoTest {

    Ruudukko g;

    public RuudukkoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        g = new Ruudukko();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void pisteetAlussaNolla() {
        assertEquals(0, g.getKokonaisPisteet());
    }

    @Test
    public void taulukkoOlemassa() {
        boolean onOlemassa = false;
        if (g.getRuudut() != null) {
            onOlemassa = true;
        }
        assertEquals(true, onOlemassa);
    }

    @Test
    public void taulukkoOikeanKokoinen() {
        int leveys = 12;
        int korkeus = 11;
        int yht = leveys + korkeus;
        ArrayList<ArrayList<Ruutu>> r = g.getRuudut();
        int taulukonKoko = r.size() + r.get(0).size();
        System.out.println(r.size());
        System.out.println(r.get(0).size());
        assertEquals(yht, taulukonKoko);
    }

    @Test
    public void tasoAlussa1() {
        int taso = g.getLevel();
        assertEquals(1, taso);
    }

    @Test
    public void testKentanLuonti() {
        boolean onkoTyhjatOikeillaPaikoilla = true;
        if (g.getRuudut().get(0).get(4) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(0).get(6) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(1).get(1) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(1).get(4) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(1).get(6) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(3).get(1) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(4).get(1) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(4).get(5) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(4).get(6) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(7).get(1) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(7).get(5) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(7).get(6) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(8).get(1) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(10).get(1) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(10).get(4) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(10).get(6) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(11).get(4) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        if (g.getRuudut().get(11).get(6) != null) {
            onkoTyhjatOikeillaPaikoilla = false;
        }
        assertEquals(true, onkoTyhjatOikeillaPaikoilla);
    }
    
    @Test
    public void testaaNollaus(){
        g.lisaaScore(200);
        g.nollaaPisteet();
        assertEquals(0, g.getKokonaisPisteet());
    }
    
    @Test
    public void testaaPisteidenLisays(){       
        g.lisaaScore(10);        
        assertEquals(10, g.getKokonaisPisteet());
    }
    
    @Test
    public void testaaSeuraavaTaso(){
        int x = g.getLevel();
        g.seuraavaTaso();
        assertEquals(x+1, g.getLevel());
    }
}
