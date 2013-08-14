/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import images.Images;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author christoph
 */
public class ImagePanel extends JPanel{
    String img_string;
    Images imgHandler = new Images();

    public ImagePanel(String img_string) {
        this.img_string = img_string;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(imgHandler.getImage(img_string), 0, 0, this.getWidth() < this.getHeight() ? this.getWidth() : this.getHeight(), this.getWidth() < this.getHeight() ? this.getWidth() : this.getHeight(), this);
    }
   
    
}
