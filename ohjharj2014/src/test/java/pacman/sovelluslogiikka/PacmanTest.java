/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacman.sovelluslogiikka;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
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
public class PacmanTest {
    
    Pacman p;
    
    public PacmanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Pacman();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        assertEquals(1, 1);
    }
    
    @Test
    public void testaaImmunity(){
        p.annaImmunity();
        assertEquals(true, p.getImmuuni());       
    }
    
    @Test
    public void testAsetaSuuntaYlos(){
        if (p.getNykyinenSuunta() != Suunta.YLOS){
            p.asetaSuunta(Suunta.YLOS);
        } else {
            p.setNykyinenSuunta(Suunta.ALAS);
            p.asetaSuunta(Suunta.YLOS);
        }
        assertEquals(Suunta.YLOS, p.getSeuraavaSuunta());
    }
    
    @Test
    public void testAsetaSuuntaAlas(){
        if (p.getNykyinenSuunta() != Suunta.ALAS){
            p.asetaSuunta(Suunta.ALAS);
        } else {
            p.setNykyinenSuunta(Suunta.YLOS);
            p.asetaSuunta(Suunta.ALAS);
        }
        assertEquals(Suunta.ALAS, p.getSeuraavaSuunta());
    }
    
    @Test
    public void testAsetaSuuntaVasen(){
        if (p.getNykyinenSuunta() != Suunta.VASEN){
            p.asetaSuunta(Suunta.VASEN);
        } else {
            p.setNykyinenSuunta(Suunta.OIKEA);
            p.asetaSuunta(Suunta.VASEN);
        }
        assertEquals(Suunta.VASEN, p.getSeuraavaSuunta());
    }
    
    @Test
    public void testAsetaSuuntaOikea(){
        if (p.getNykyinenSuunta() != Suunta.OIKEA){
            p.asetaSuunta(Suunta.OIKEA);
        } else {
            p.setNykyinenSuunta(Suunta.VASEN);
            p.asetaSuunta(Suunta.OIKEA);
        }
        assertEquals(Suunta.OIKEA, p.getSeuraavaSuunta());
    }
    
    @Test
    public void testLiiku(){
        boolean liikkuiko = true;
        int y = p.getY();
        p.liiku(Suunta.YLOS);
        if (y>=p.getY()){
            liikkuiko = false;
        }
        int y2 = p.getY();
        p.liiku(Suunta.ALAS);
        if (y2<=p.getY()){
            liikkuiko = false;
        }
        int x = p.getX();
        p.liiku(Suunta.VASEN);
        if (x>=p.getX()){
            liikkuiko = false;
        }
        int x2 = p.getX();
        p.liiku(Suunta.OIKEA);
        if (x2<=p.getX()){
            liikkuiko = false;
        }
    }
    
    @Test 
    public void testGetBounds(){
        Rectangle r = new Rectangle(p.getX()+5, p.getY()+5, 20, 20);
        assertEquals(r, p.getBounds());
    }
    
    @Test
    public void testGetImmuuni(){
        p.annaImmunity();
        assertEquals(true, p.getImmuuni());
    } 
    
    @Test
    public void testaaOsuukoHaamu(){
        p.setX(50);
        p.setY(60);
        Haamu h = new Haamu(50, 50);
        boolean osuuko = h.getBounds().intersects(p.getBounds());
        assertEquals(osuuko, p.osuukoHaamu(h));
    }
    
    @Test
    public void testaaResetPosition(){
        p.liiku(Suunta.YLOS);
        p.liiku(Suunta.OIKEA);
        p.resetPosition();
        boolean onnistuiko = true;
        p.resetPosition();
        if (p.getX()!=0) onnistuiko = false;
        if (p.getY()!=150) onnistuiko = false;
        if (p.getNykyinenSuunta()!=Suunta.OIKEA) onnistuiko = false;
        if (p.getSeuraavaSuunta()!=Suunta.OIKEA) onnistuiko = false;
        assertEquals(true, onnistuiko);
    }
}
