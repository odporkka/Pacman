/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacman.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pacman.sovelluslogiikka.Peli;

/**
 *
 * @author odporkka
 */
public class NewGameListener implements ActionListener{
    
    Peli p;

    public NewGameListener(Peli p) {
        this.p = p;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        p.newGame();
    }
    
}
