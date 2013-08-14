/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plox;

import java.util.ArrayList;

/**
 *
 * @author christoph
 */
public class Level {
    private int sizeX;
    private int sizeY;
    private Player player;
    private ArrayList<Block> blockList = new ArrayList<>();
    private ArrayList<LevelComponent> lcList = new ArrayList<>();
    
    public void tick()
    {
        lcList.remove(player);
        lcList.add(0, player);
        
        for (int i = 0; i < lcList.size(); i++) {
            LevelComponent lc1 = lcList.get(i);
            for (int j = i + 1; j < lcList.size(); j++) {
                LevelComponent lc2 = lcList.get(j);  
                if(lc1.nextPosition().equals(lc2.getPosition()))
                {
                    lc2.onCollision(lc1);
                }else if(lc2.nextPosition().equals(lc1.getPosition()))
                {
                    lc1.onCollision(lc2);
                }
            }
            lc1.move();
        }
    }

    public Level() {
    }

    
    public Level(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.player = new Player(new Direction(Direction.OPTION_UP), sizeX/2, sizeY/2, this);
        lcList.addAll(blockList);
        lcList.add(player);
    }
    
    public Player getPlayer()
    {
        return player;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public ArrayList<Block> getBlockList() {
        return blockList;
    }
    
    public void addBlock(Block block)
    {
        blockList.add(block);
        lcList.add(block);
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public void setPlayer(Player player) {
        lcList.remove(player);
        this.player = player;
        lcList.add(player);
        
    }
    
    
}
