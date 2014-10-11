/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacman.kayttoliittyma;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import pacman.sovelluslogiikka.Pacman;
import pacman.sovelluslogiikka.Peli;

/**
 *
 * @author odporkka
 */
public class KeyBoardListener implements KeyListener{
    Peli peli;
    Pacman p;
    Container c;

    public KeyBoardListener(Pacman p, Container c, Peli peli) {
        this.p = p;
        this.c = c;
        this.peli = peli;
    } 

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT){
            p.asetaSuunta('v');
        }
        else if (ke.getKeyCode() == KeyEvent.VK_RIGHT){
            p.asetaSuunta('o');
        }
        else if (ke.getKeyCode() == KeyEvent.VK_UP){
            p.asetaSuunta('y');
        }
        else if (ke.getKeyCode() == KeyEvent.VK_DOWN){
            p.asetaSuunta('a');
        }
        else if (ke.getKeyCode() == KeyEvent.VK_F2){
            peli.newGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    
}
