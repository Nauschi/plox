/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plox;

/**
 *
 * @author christoph
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Position(Position pos, int xOff, int yOff) {
        x = pos.getX() + xOff;
        y = pos.getY() + yOff;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getArray() {
        int[] temp = new int[2];
        temp[0] = x;
        temp[1] = y;
        return temp;
    }
      
    public void addX(int x)
    {
        this.x += x;
        System.out.println("" + x);
    }
    
    public void addY(int y)
    {
        this.y += y;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    
}
