/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypesystem;

import java.awt.EventQueue;

/**
 *
 * @author Nieto
 */
public class SystemMain {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Register rgg = new Register();
                rgg.setVisible(true);
            }
        });
    }
    
}
