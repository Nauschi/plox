/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plox;



/**
 *
 * @author christoph
 */
public abstract class Block extends LevelComponent {
    protected Player player;
    
    public Block(int posX, int posY, Level parentLevel) {
        super(posX, posY, parentLevel);
        player = parentLevel.getPlayer();
    }
}
