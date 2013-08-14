/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saveloadlevels;

import plox.*;
import blocktypes.*;
import java.util.ArrayList;

/**
 *
 * @author christoph
 */
public class BlockSaveHandler {
    
    public String getBlockName(Block block)
    {
        if(block instanceof StaticBlock)
        {
            return "static_block";
        }
        return "error";
    }
    
    public String[] getBlockAttributes(Block block)
    {
        String[] array = {"error"};
        if(block instanceof StaticBlock)
        {
            array = new String[2];
            array[0] = block.getX() + "";
            array[1] = block.getY() + "";
        }
        return array;
    }
    
    public String getBlockAttributes(Block block, char seperator)
    {
        String[] array = {"error"};
        if(block instanceof StaticBlock)
        {
            array = new String[2];
            array[0] = block.getX() + "";
            array[1] = block.getY() + "";
        }
        return array[0] + seperator + array[1];
    }
    
    public Block getBlock(String blockName, String[] blockAttributes, Level level)
    {
        if(blockName.equals("static_block"))
        {
            return new StaticBlock(Integer.parseInt(blockAttributes[0]), Integer.parseInt(blockAttributes[1]), level);
        }
        return new StaticBlock(0, 0, level);
    }
}
