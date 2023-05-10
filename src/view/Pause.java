/*****************************************************
*Autor:America Yaridsaida Villalobos Rodríguez       *
* Fecha de creación: 01/05/2023                      *
* Fecha de actualización: 04/05/2023                 *
* Descripcion:Esta es la ventana pausa               *
******************************************************/
package view;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Pause extends javax.swing.JFrame {

   
    public Pause() {
         setResizable(false);
         setLocationRelativeTo(null);
        initComponents();
        
        
        ImageIcon imagen = new ImageIcon(
                "./src/images/wallpaperGeneric.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(
                wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));
        wallpaper.setIcon(icono);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonExit = new javax.swing.JButton();
        buttonMin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelTime = new javax.swing.JLabel();
        labelPause = new javax.swing.JLabel();
        labelPoints = new javax.swing.JLabel();
        buttonContinue = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        buttonExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(204, 0, 0));
        buttonExit.setText("X");
        buttonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonExitMouseExited(evt);
            }
        });
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonMin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonMin.setForeground(new java.awt.Color(204, 0, 0));
        buttonMin.setText("-");
        buttonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(buttonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 323, -1, -1));

        labelTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setText("Tiempo");
        getContentPane().add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 65, 28));

        labelPause.setBackground(new java.awt.Color(255, 255, 255));
        labelPause.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelPause.setForeground(new java.awt.Color(255, 255, 255));
        labelPause.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPause.setText("PAUSA");
        getContentPane().add(labelPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 48, 199, 87));

        labelPoints.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPoints.setForeground(new java.awt.Color(255, 255, 255));
        labelPoints.setText("Puntos");
        getContentPane().add(labelPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 64, 27));

        buttonContinue.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonContinue.setText("Continuar");
        getContentPane().add(buttonContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 247, 128, 49));

        wallpaper.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 516, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseEntered

    }//GEN-LAST:event_buttonExitMouseEntered

    private void buttonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonExitMouseExited

    }//GEN-LAST:event_buttonExitMouseExited

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pause().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonContinue;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelPause;
    private javax.swing.JLabel labelPoints;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
