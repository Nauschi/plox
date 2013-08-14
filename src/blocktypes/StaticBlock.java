/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blocktypes;

import java.awt.Image;
import plox.Block;
import plox.Level;
import plox.LevelComponent;
import plox.Player;

/**
 *
 * @author christoph
 */
public class StaticBlock extends Block {

    public StaticBlock(int posX, int posY, Level parentLevel) {
        super(posX, posY, parentLevel);
    }

    @Override
    public Image getImage() {
        return imgRes.getImage("static");
    }

    @Override
    public void onCollision(LevelComponent source) {
       source.flip();
       source.setMoving(false);
       if(source instanceof MoveBlock)
            ((MoveBlock)source).stopMovers();
    }

    

    
    
    
}
