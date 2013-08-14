/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plox;

/**
 *
 * @author christoph
 */
public class Direction {
    private int x;
    private int y;

    public static final int OPTION_LEFT = 1;
    public static final int OPTION_RIGHT = 2;
    public static final int OPTION_UP = 3;
    public static final int OPTION_DOWN = 4;
    
    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Direction(int option) {
        switch(option)
        {
            case OPTION_LEFT:setLeft();break;
            case OPTION_RIGHT:setRight();break;
            case OPTION_UP:setUp();break;
            case OPTION_DOWN:setDown();break;
        }
    }
    
    public boolean isLeft() {
        return (x == -1 && y == 0);
    }
    
    public boolean isRight() {
        return (x == 1 && y == 0);
    }
    
    public boolean isUp() {
        return (x == 0 && y == -1);
    }
    
    public boolean isDown() {
        return (x == 0 && y == 1);
    }
    
    public void setLeft() {
        x = -1;y = 0;
    }
    
    public void setRight() {
        x = 1;y = 0;
    }
    
    public void setUp() {
        x = 0;y = -1;
    }
    
    public void setDown() {
        x = 0;y = 1;
    }
    
    public void flip() {
        x *= -1;
        y *= -1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
