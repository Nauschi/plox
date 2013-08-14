/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author christoph
 */
public class Images {
    
    public Image getImage(String resourceName)
    {
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource(resourceName + ".png"));
        
        return ii.getImage();
    }
    
    
}
