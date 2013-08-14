/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.event.KeyAdapter;
import java.io.IOException;
import javax.swing.JFrame;
import plox.*;

/**
 *
 * @author christoph, nauschi
 */
public class PlayFrame extends PloxFrame {
    
    public static int RESOLUTION = 32;
    public static int LEVEL_X = 30;
    public static int LEVEL_Y = 30;
    
    public PlayFrame() {
        add(new Board(new Level(LEVEL_X, LEVEL_Y), this));
        setTitle("PLOX");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(RESOLUTION * LEVEL_X + 3, RESOLUTION * LEVEL_Y + 30);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
    }
    public static void main(String[] args) {
        new PlayFrame();
    }

    @Override
    public int getResolutionX() {
        return RESOLUTION * LEVEL_X + 3;
    }

    @Override
    public int getResolutionY() {
       return RESOLUTION * LEVEL_Y + 30;
    }
    
    

     
}
