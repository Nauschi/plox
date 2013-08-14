/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blocktypes;

import java.awt.Image;
import java.util.ArrayList;
import plox.*;

/**
 *
 * @author christoph
 */
public class MoveBlock extends Block{

    ArrayList<LevelComponent> movers = new ArrayList<>();
    
    @Override
    public Image getImage() {
        return imgRes.getImage("move");
    }

    public MoveBlock(int posX, int posY, Level parentLevel) {
        super(posX, posY, parentLevel);
    }

    @Override
    public void onCollision(LevelComponent source) {     
       if(!movers.contains(source))
        movers.add(source);
       
       Direction d = source.getDirection();
       pos.addX(d.getX());
       pos.addY(d.getY());
       setMoving(true);
       direction = source.getDirection();
    }
    
    public void stopMovers()
    {
        for (int i = 0; i < movers.size(); i++) {
            movers.get(i).setMoving(false);
            if(movers.get(i) instanceof MoveBlock)
                ((MoveBlock)movers.get(i)).stopMovers();
        }
    }

    
    
    
}
