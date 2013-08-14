/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SidebarFrame.java
 *
 * Created on 09.08.2013, 20:07:26
 */
package userinterface;

/**
 *
 * @author christoph
 */
public class SidebarFrame extends javax.swing.JFrame {

    Board boardPanel;
    EditorFrame parent;
   
    /** Creates new form SidebarFrame */
    public SidebarFrame() {
        initComponents();
    }
    
    public SidebarFrame(Board pnl, EditorFrame frame) {
        initComponents();
        boardPanel = pnl;
        parent = frame;
        setLocation(frame.getLocation().x - getWidth(), frame.getLocation().y);
        setTitle("sidebar");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_draw_controls = new javax.swing.JPanel();
        pnl_load = new ImagePanel("load_button");
        pnl_save = new ImagePanel("save_button");
        pnl_player = new ImagePanel("player_button");
        pnl_expand = new ImagePanel("expand_button");
        pnl_goal = new ImagePanel("goal_button");
        pnl_image = new ImagePanel("image_button");

        getContentPane().setLayout(new java.awt.GridLayout());

        pnl_draw_controls.setBackground(new java.awt.Color(-1,true));
        pnl_draw_controls.setToolTipText("");
        pnl_draw_controls.setLayout(new java.awt.GridLayout(6, 0, 0, 20));

        pnl_load.setBackground(new java.awt.Color(-1,true));
        pnl_load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_loadonLoadClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_loadLayout = new javax.swing.GroupLayout(pnl_load);
        pnl_load.setLayout(pnl_loadLayout);
        pnl_loadLayout.setHorizontalGroup(
            pnl_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        pnl_loadLayout.setVerticalGroup(
            pnl_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnl_draw_controls.add(pnl_load);

        pnl_save.setBackground(new java.awt.Color(-1,true));
        pnl_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_saveonSaveClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_saveLayout = new javax.swing.GroupLayout(pnl_save);
        pnl_save.setLayout(pnl_saveLayout);
        pnl_saveLayout.setHorizontalGroup(
            pnl_saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        pnl_saveLayout.setVerticalGroup(
            pnl_saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnl_draw_controls.add(pnl_save);

        pnl_player.setBackground(new java.awt.Color(-1,true));
        pnl_player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_playeronPlayerClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_playerLayout = new javax.swing.GroupLayout(pnl_player);
        pnl_player.setLayout(pnl_playerLayout);
        pnl_playerLayout.setHorizontalGroup(
            pnl_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        pnl_playerLayout.setVerticalGroup(
            pnl_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnl_draw_controls.add(pnl_player);

        pnl_expand.setBackground(new java.awt.Color(-1,true));
        pnl_expand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_expandonExpandClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_expandLayout = new javax.swing.GroupLayout(pnl_expand);
        pnl_expand.setLayout(pnl_expandLayout);
        pnl_expandLayout.setHorizontalGroup(
            pnl_expandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        pnl_expandLayout.setVerticalGroup(
            pnl_expandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnl_draw_controls.add(pnl_expand);

        pnl_goal.setBackground(new java.awt.Color(-1,true));
        pnl_goal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_goalonLoadClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_goalLayout = new javax.swing.GroupLayout(pnl_goal);
        pnl_goal.setLayout(pnl_goalLayout);
        pnl_goalLayout.setHorizontalGroup(
            pnl_goalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        pnl_goalLayout.setVerticalGroup(
            pnl_goalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnl_draw_controls.add(pnl_goal);

        pnl_image.setBackground(new java.awt.Color(-1,true));
        pnl_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_imageonLoadClick(evt);
            }
        });

        javax.swing.GroupLayout pnl_imageLayout = new javax.swing.GroupLayout(pnl_image);
        pnl_image.setLayout(pnl_imageLayout);
        pnl_imageLayout.setHorizontalGroup(
            pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        pnl_imageLayout.setVerticalGroup(
            pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        pnl_draw_controls.add(pnl_image);

        getContentPane().add(pnl_draw_controls);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void pnl_loadonLoadClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_loadonLoadClick
    boardPanel.load();
}//GEN-LAST:event_pnl_loadonLoadClick

private void pnl_saveonSaveClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_saveonSaveClick
    boardPanel.save();
}//GEN-LAST:event_pnl_saveonSaveClick

private void pnl_playeronPlayerClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_playeronPlayerClick
    parent.setDrawMode(EditorFrame.PLAYER_DRAW);
}//GEN-LAST:event_pnl_playeronPlayerClick

private void pnl_expandonExpandClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_expandonExpandClick
   SizeOkCancelDialog ocd = new SizeOkCancelDialog(this, true, boardPanel);
   ocd.setVisible(true);
}//GEN-LAST:event_pnl_expandonExpandClick

private void pnl_goalonLoadClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_goalonLoadClick
    boardPanel.load();
}//GEN-LAST:event_pnl_goalonLoadClick

private void pnl_imageonLoadClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_imageonLoadClick
    boardPanel.load();
}//GEN-LAST:event_pnl_imageonLoadClick

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
            java.util.logging.Logger.getLogger(SidebarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SidebarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SidebarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SidebarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SidebarFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl_draw_controls;
    private javax.swing.JPanel pnl_expand;
    private javax.swing.JPanel pnl_goal;
    private javax.swing.JPanel pnl_image;
    private javax.swing.JPanel pnl_load;
    private javax.swing.JPanel pnl_player;
    private javax.swing.JPanel pnl_save;
    // End of variables declaration//GEN-END:variables
}
