/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plox;

import java.awt.Image;
import java.util.Arrays;

/**
 *
 * @author christoph
 */
public class Player extends LevelComponent {
    
    
    
    
    
    public Player(Direction direction, int posX, int posY, Level parent) {
        super(posX, posY, parent);
        this.direction = direction;
        
    }

    public Player(int posX, int posY, Level parentLevel) {
        super(posX, posY, parentLevel);
    }
    
    
    
    
    

    @Override
    public Image getImage() {
        if(direction.isUp())
            return imgRes.getImage("man_up");
        if(direction.isDown())
            return imgRes.getImage("man_down");
        if(direction.isLeft())
            return imgRes.getImage("man_left");
        if(direction.isRight())
            return imgRes.getImage("man_right");
        
        return imgRes.getImage("error");
    }

    

    @Override
    public void onCollision(LevelComponent source) {
        die();
    }
    
    //TODO add gameover code or something
    public void die()
    {
        
    }

    

    
    
}
