/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BlockFrame.java
 *
 * Created on 09.08.2013, 21:15:53
 */
package userinterface;


import images.Images;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author christoph
 */
public class BlockFrame extends javax.swing.JFrame {

    Board boardPanel;
    EditorFrame parent;
    private Cursor static_cursor;
    private Cursor move_cursor;
    private Cursor fade_cursor;
    private Cursor self_move_cursor;
    private Images img = new Images();
    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    
    /** Creates new form BlockFrame */
    public BlockFrame() {
        initComponents();
    }
    
    public BlockFrame(Board pnl, EditorFrame frame) {
        initComponents();
        boardPanel = pnl;
        parent = frame;
        setLocation(frame.getLocation().x + frame.getWidth(), frame.getLocation().y + 120);
        
        
        static_cursor = toolkit.createCustomCursor(img.getImage("static").getScaledInstance(20, 20, 0) , new Point(0, 0), "static_block");
        move_cursor = toolkit.createCustomCursor(img.getImage("move").getScaledInstance(20, 20, 0) , new Point(0, 0), "move_block");
        fade_cursor = toolkit.createCustomCursor(img.getImage("fade").getScaledInstance(20, 20, 0) , new Point(0, 0), "fade_block");
        self_move_cursor = toolkit.createCustomCursor(img.getImage("self_move").getScaledInstance(20, 20, 0) , new Point(0, 0), "self_move_block");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_blocks = new javax.swing.JPanel();
        pnl_static = new ImagePanel("static");
        pnl_move = new ImagePanel("move");
        pnl_fade = new ImagePanel("fade");
        pnl_self_move = new ImagePanel("self_move");

        setTitle("blocks");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnl_blocks.setBackground(new java.awt.Color(-1,true));
        pnl_blocks.setBorder(javax.swing.BorderFactory.createTitledBorder("blocks"));
        pnl_blocks.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        pnl_static.setBackground(new java.awt.Color(-1,true));
        pnl_static.setBorder(null);
        pnl_static.setMaximumSize(new Dimension(60, 60));
        pnl_static.setMinimumSize(new Dimension(60, 60));
        pnl_static.setPreferredSize(new Dimension(60, 60));
        pnl_static.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onStaticClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_staticLayout = new javax.swing.GroupLayout(pnl_static);
        pnl_static.setLayout(pnl_staticLayout);
        pnl_staticLayout.setHorizontalGroup(
            pnl_staticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        pnl_staticLayout.setVerticalGroup(
            pnl_staticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        pnl_blocks.add(pnl_static);

        pnl_move.setBackground(new java.awt.Color(-1,true));
        pnl_move.setBorder(null);
        pnl_move.setMaximumSize(new Dimension(60, 60));
        pnl_move.setMinimumSize(new Dimension(60, 60));
        pnl_move.setPreferredSize(new Dimension(60, 60));
        pnl_move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onMoveClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_moveLayout = new javax.swing.GroupLayout(pnl_move);
        pnl_move.setLayout(pnl_moveLayout);
        pnl_moveLayout.setHorizontalGroup(
            pnl_moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        pnl_moveLayout.setVerticalGroup(
            pnl_moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        pnl_blocks.add(pnl_move);

        pnl_fade.setBackground(new java.awt.Color(-1,true));
        pnl_fade.setBorder(null);
        pnl_fade.setMaximumSize(new Dimension(60, 60));
        pnl_fade.setMinimumSize(new Dimension(60, 60));
        pnl_fade.setPreferredSize(new Dimension(60, 60));
        pnl_fade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onFadeClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_fadeLayout = new javax.swing.GroupLayout(pnl_fade);
        pnl_fade.setLayout(pnl_fadeLayout);
        pnl_fadeLayout.setHorizontalGroup(
            pnl_fadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        pnl_fadeLayout.setVerticalGroup(
            pnl_fadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        pnl_blocks.add(pnl_fade);

        pnl_self_move.setBackground(new java.awt.Color(-1,true));
        pnl_self_move.setBorder(null);
        pnl_self_move.setMaximumSize(new Dimension(60, 60));
        pnl_self_move.setMinimumSize(new Dimension(60, 60));
        pnl_self_move.setPreferredSize(new Dimension(60, 60));
        pnl_self_move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSelfMoveClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_self_moveLayout = new javax.swing.GroupLayout(pnl_self_move);
        pnl_self_move.setLayout(pnl_self_moveLayout);
        pnl_self_moveLayout.setHorizontalGroup(
            pnl_self_moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        pnl_self_moveLayout.setVerticalGroup(
            pnl_self_moveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        pnl_blocks.add(pnl_self_move);

        getContentPane().add(pnl_blocks);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void onStaticClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onStaticClick
    parent.setCursor(static_cursor);
    parent.setDrawMode(EditorFrame.STATIC_DRAW);
}//GEN-LAST:event_onStaticClick

private void onMoveClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onMoveClick
    parent.setCursor(move_cursor);
    parent.setDrawMode(EditorFrame.MOVE_DRAW);
}//GEN-LAST:event_onMoveClick

private void onFadeClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onFadeClick
    parent.setCursor(fade_cursor);
    parent.setDrawMode(EditorFrame.FADE_DRAW);
}//GEN-LAST:event_onFadeClick

private void onSelfMoveClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSelfMoveClick
    parent.setCursor(self_move_cursor);
    parent.setDrawMode(EditorFrame.SELF_MOVE_DRAW);
}//GEN-LAST:event_onSelfMoveClick

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BlockFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl_blocks;
    private javax.swing.JPanel pnl_fade;
    private javax.swing.JPanel pnl_move;
    private javax.swing.JPanel pnl_self_move;
    private javax.swing.JPanel pnl_static;
    // End of variables declaration//GEN-END:variables
}
