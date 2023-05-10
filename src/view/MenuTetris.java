/*****************************************************
*Autor:America Yaridsaida Villalobos Rodríguez       *
* Fecha de creación: 01/05/2023                      *
* Fecha de actualización: 04/05/2023                 *
* Descripción:Esta es la ventana menú que llevara al *
* usuario a donde quiera ir en el juego              *
******************************************************/
package view;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class MenuTetris extends javax.swing.JFrame {

    
   
    public MenuTetris() {
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        ImageIcon imagen = new ImageIcon("./src/images/menu.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));
        wallpaper.setIcon(icono);

        ImageIcon imagen2 = new ImageIcon("./src/images/botonTetris.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(
                buttonAjustes.getWidth(),
                buttonAjustes.getHeight(), Image.SCALE_DEFAULT));
        buttonAjustes.setIcon(icono2);

        Icon icono3 = new ImageIcon(imagen2.getImage().getScaledInstance(
                buttonExit.getWidth(),
                buttonExit.getHeight(), Image.SCALE_DEFAULT));
        buttonExit.setIcon(icono3);

        Icon icono4 = new ImageIcon(imagen2.getImage().getScaledInstance(
                buttonPlay.getWidth(),
                buttonPlay.getHeight(), Image.SCALE_DEFAULT));
        buttonPlay.setIcon(icono4);

        Icon icono5 = new ImageIcon(imagen2.getImage().getScaledInstance(
                buttonPoints.getWidth(),
                buttonPoints.getHeight(), Image.SCALE_DEFAULT));
        
        buttonPoints.setIcon(icono5);

        ImageIcon imagen3 = new ImageIcon("./src/images/tetrisImage.png");
        Icon icono6 = new ImageIcon(imagen3.getImage().getScaledInstance(
                labelTitle.getWidth(),
                labelTitle.getHeight(), Image.SCALE_DEFAULT));
        buttonPoints.setIcon(icono5);
        
        labelTitle.setIcon(icono6);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        buttonPoints = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonAjustes = new javax.swing.JButton();
        buttonPlay = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPoints.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        buttonPoints.setForeground(new java.awt.Color(255, 255, 255));
        buttonPoints.setText("Puntaje");
        buttonPoints.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPoints.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPoints.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        buttonPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPointsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, 60));

        buttonExit.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setText("Salir");
        buttonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 200, 60));

        buttonAjustes.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        buttonAjustes.setForeground(new java.awt.Color(255, 255, 255));
        buttonAjustes.setText("Ajustes");
        buttonAjustes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAjustes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjustesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 200, 60));

        buttonPlay.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        buttonPlay.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlay.setText("Jugar");
        buttonPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlayActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 60));

        labelTitle.setFont(new java.awt.Font("Waree", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 240, 70));

        wallpaper.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 430, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPointsActionPerformed
        new ListPoints().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPointsActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlayActionPerformed
        new Game().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonPlayActionPerformed

    private void buttonAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjustesActionPerformed
        new Settings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAjustesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTetris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjustes;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JButton buttonPoints;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
   
   
    
}
   

