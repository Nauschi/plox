/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package saveloadlevels;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ListIterator;
import plox.Block;
import plox.Direction;
import plox.Level;
import plox.Player;

/**
 *
 * @author christoph
 */
public class LevelSaver {
    
    private static char SEPERATOR_01 = ':';
    private static char SEPERATOR_02 = ';';
    private BlockSaveHandler bsh = new BlockSaveHandler();
    
    public void save(Level level, File file) throws IOException
    {
        ListIterator<Block> li = level.getBlockList().listIterator();
        FileWriter fw = new FileWriter(file.getAbsolutePath() + ".sav", true);
        BufferedWriter bw = new BufferedWriter(fw);
        while(li.hasNext())
        {
            Block block = li.next();
            bw.append(bsh.getBlockName(block) + SEPERATOR_01 + bsh.getBlockAttributes(block, SEPERATOR_02));
            bw.newLine();
        }
        bw.append("player_position" + SEPERATOR_01 + level.getPlayer().getX() + SEPERATOR_02 + level.getPlayer().getY());
        bw.newLine();
        bw.append("player_direction" + SEPERATOR_01 + level.getPlayer().getDirection().getX() + SEPERATOR_02 + level.getPlayer().getDirection().getY());
        bw.newLine();
        bw.append("level_size" + SEPERATOR_01 + level.getSizeX() + SEPERATOR_02 + level.getSizeY());
        bw.newLine();
        
        bw.close();
    }
    
    public Level load(File file) throws FileNotFoundException, IOException, ParseException, ArrayIndexOutOfBoundsException
    {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Level level = new Level();
        level.setPlayer(new Player(0, 0, level));
        String currentLine;
        int checkSum = 0;
        int check = 3;
        
        while ((currentLine = br.readLine()) != null) {
            String[] line = currentLine.split(SEPERATOR_01 + "");
            String[] attr = line[1].split(SEPERATOR_02 + "");
            if(line[0].contains("block"))
            {
            level.addBlock(bsh.getBlock(line[0], attr, level));
            }else if(line[0].contains("player_direction")){
                level.getPlayer().setDirection(new Direction(Integer.parseInt(attr[0]), Integer.parseInt(attr[1])));
                checkSum++;
            }else if(line[0].contains("player_position")){
                level.getPlayer().setPosX(Integer.parseInt(attr[0]));
                level.getPlayer().setPosY(Integer.parseInt(attr[1]));
                checkSum++;
            }else if(line[0].contains("level_size")){
                level.setSizeX(Integer.parseInt(attr[0]));
                level.setSizeY(Integer.parseInt(attr[1]));
                checkSum++;
            }
        }
        br.close();
        if(checkSum < check)
            throw new ParseException("Invalid .sav file", 0);
        return level;
    }
}
