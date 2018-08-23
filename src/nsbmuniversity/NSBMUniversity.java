/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmuniversity;

import javax.swing.JFrame;

/**
 *
 * @author Asangi
 */
public class NSBMUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LogIn lg = new LogIn();
       lg.setVisible(true);
       lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}
