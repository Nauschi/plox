/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ListIterator;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import plox.*;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import saveloadlevels.LevelSaver;


public class Board extends JPanel implements Runnable {

    private boolean drawGrid = true;
    private Thread animator;
    private int DELAY = 70;
    private Level level;
    private String error_string = "File loading failed, please select a valid .sav file.\n\nerror code: ";
    private final JFileChooser fc = new JFileChooser();
    private PloxFrame  pf;
    private int resolution;
    private boolean runThread = true;

    public Board(Level level, PloxFrame frame) {
        setBackground(Color.WHITE);
        setFocusable(true);
        setDoubleBuffered(true);
        this.level = level;
        this.load();
        addKeyListener(new MovementAdapter());
        pf = frame;
    }

    public void pause()
    {
        runThread = false;
    }
    
    public void restart()
    {
        runThread = true;
    }
    
    public void load()
    {
        LevelSaver ls = new LevelSaver();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "plox save files (*.sav)", "sav");
        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                this.level = ls.load(file);
            } catch (IOException | ParseException | ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(this, error_string + ex);
            }
        }
    }
    
    public void save()
    {
        LevelSaver ls = new LevelSaver();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "plox save files (*.sav)", "sav");
        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fc.getSelectedFile();
                ls.save(level, file);
            } catch (IOException | ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(this, error_string + ex);
            }
        }
    }

    public void addNotify() {
        super.addNotify();
        animator = new Thread(this);
        animator.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        int resX = pf.getResolutionX()/level.getSizeX();
        int resY = pf.getResolutionY()/level.getSizeY();
        
        resolution = resX < resY ? resX : resY;
        
        Graphics2D g2d = (Graphics2D)g;
        
        Player pl = level.getPlayer();
        
        if(drawGrid)
        {
            for(int i = 0; i <= level.getSizeX(); i++)
            {
                g2d.setColor(Color.pink);
                g2d.drawLine(i * resolution, 0, resolution * i, level.getSizeY() * resolution);
            }
            
            for(int i = 0; i <= level.getSizeY(); i++)
            {
                g2d.setColor(Color.pink);
                g2d.drawLine(0, i * resolution, level.getSizeX() * resolution, resolution * i);
            }
        }
        
        ListIterator<Block> li = level.getBlockList().listIterator();
        while(li.hasNext())
        {
            Block block = li.next();
            drawImage(g2d, block.getImage(), block.getX(), block.getY());
        }
        
        drawImage(g2d, pl.getImage(), pl.getX(), pl.getY());
        //paint something
        
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    private void drawImage(Graphics2D g, Image img, int x, int y)
    {
        g.drawImage(img, x * resolution, y * resolution, resolution, resolution, this);
    }

    public void threadTick() {
          level.tick();
    }

    public void run() {
        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();

        while (true) {
            if(runThread)
            {
            threadTick();          
            repaint();
            }
            
            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0)
                sleep = 2;
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }

            beforeTime = System.currentTimeMillis();
            
        }
    }

    

    private class MovementAdapter extends KeyAdapter {
        
        
        public void keyPressed(KeyEvent ke) {  
                Player pl = level.getPlayer();
            
                if(!level.getPlayer().isMoving())
                {
                Direction d = pl.getDirection();
                int kc = ke.getKeyCode();
                if (kc == KeyEvent.VK_DOWN) { 
                     d.setDown();
                } else if (kc == KeyEvent.VK_LEFT) {
                     d.setLeft();
                } else if (kc == KeyEvent.VK_UP) {
                     d.setUp();
                } else if (kc == KeyEvent.VK_RIGHT) {
                     d.setRight();
                }
                
                pl.setMoving(true);
                
                }
       }
    
    }

    public void setPlayerPosition(int x, int y)
    {
        level.getPlayer().setPosX(x);
        level.getPlayer().setPosY(y);
    }

    public int getResolution() {
        return resolution;
    }

    public Level getLevel() {
        return level;
    }

    public void setDrawGrid(boolean drawGrid) {
        this.drawGrid = drawGrid;
    }

    public void setDELAY(int DELAY) {
        this.DELAY = DELAY;
    }
    
    
}