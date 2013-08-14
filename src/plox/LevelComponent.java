/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plox;

import images.Images;
import images.hasImage;
import plox.Direction;

/**
 *
 * @author christoph
 */
public abstract class LevelComponent implements hasImage{
    protected Position pos;
    protected Level level;
    protected Images imgRes = new Images();
    protected Direction direction;
    protected boolean moving = false;

    public LevelComponent(int posX, int posY, Level parentLevel) {
        pos = new Position(posX, posY);
        direction = new Direction(0, 0);
        this.level = parentLevel;
    }

    public void setImgRes(Images imgRes) {
        this.imgRes = imgRes;
    }

    public void setParentLevel(Level parentLevel) {
        this.level = parentLevel;
    }

    public void setPosX(int posX) {
        pos.setX(posX);
    }

    public void setPosY(int posY) {
        pos.setY(posY);
    }
    
    public int getX()
    {
        return pos.getX();
    }
    
    public int getY()
    {
        return pos.getY();
    }
    
    public Position getPosition()
    {
        return pos;
    }
    
    public void setDirection(Direction direction) {
        
        this.direction = direction;
    }

    public void setMoving(boolean moving) {
        
        this.moving = moving;
    }

    public boolean isMoving() {
        return moving;
    }
    
    /**
     * Returns positon after next step
     * @return 
     */
    public Position nextPosition()
    {
        Position temp = new Position(pos, direction.getX(), direction.getY());
        return temp;
    }
    
    public void flip()
    {
        direction.flip();
    }

    public Direction getDirection() {
        return direction;
    }
    
    public void move()
    {
        if(moving)
        {
            pos.addX(direction.getX());
            pos.addY(direction.getY());
        }
    }
    
    public abstract void onCollision(LevelComponent source);
}
