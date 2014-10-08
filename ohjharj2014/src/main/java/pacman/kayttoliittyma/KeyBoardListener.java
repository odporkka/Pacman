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

/**
 *
 * @author odporkka
 */
public class KeyBoardListener implements KeyListener{
    
    Pacman p;
    Container c;

    public KeyBoardListener(Pacman p, Container c) {
        this.p = p;
        this.c = c;
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
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
    
    
}
