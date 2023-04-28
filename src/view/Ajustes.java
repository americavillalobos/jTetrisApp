/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
public class Ajustes extends javax.swing.JFrame {

    /**
     * Creates new form Ajustes
     */
    public Ajustes() {
        initComponents();
        this.setVisible(true);
        this.setSize(490, 613);
        System.out.println("Contructor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        checkMusic = new javax.swing.JCheckBox();
        sliderVol = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        sliderVel = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPathSound = new javax.swing.JTextField();
        buttonExplorer = new javax.swing.JButton();
        buttonAccept = new javax.swing.JButton();
        buttonControls = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 50, 40));

        buttonClose.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonClose.setForeground(new java.awt.Color(255, 255, 255));
        buttonClose.setText("X");
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCloseMouseExited(evt);
            }
        });
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel2.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Ajustes");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 237, 90));

        checkMusic.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        checkMusic.setSelected(true);
        checkMusic.setText("Musica");
        checkMusic.setContentAreaFilled(false);
        checkMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkMusic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkMusic.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(checkMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 93, -1));

        sliderVol.setPaintLabels(true);
        sliderVol.setPaintTicks(true);
        sliderVol.setValue(100);
        jPanel1.add(sliderVol, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 250, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Volumen");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, -1));

        sliderVel.setPaintLabels(true);
        sliderVel.setPaintTicks(true);
        sliderVel.setSnapToTicks(true);
        sliderVel.setValue(100);
        jPanel1.add(sliderVel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 250, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Velocidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Cargar pista");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        txtPathSound.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPathSound.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPathSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 160, 30));

        buttonExplorer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonExplorer.setText("Explorar");
        buttonExplorer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(buttonExplorer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 80, 30));

        buttonAccept.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonAccept.setText("Aceptar");
        buttonAccept.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(buttonAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 170, 40));

        buttonControls.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonControls.setText("Controles");
        buttonControls.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonControls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonControlsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonControls, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 170, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 480, 20));
        jPanel1.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 483, 567));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseEntered
        this.buttonClose.setForeground(Color.red);
    }//GEN-LAST:event_buttonCloseMouseEntered

    private void buttonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseExited
        this.buttonClose.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonCloseMouseExited

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonControlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonControlsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonControlsActionPerformed

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
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new Ajustes().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccept;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonControls;
    private javax.swing.JButton buttonExplorer;
    private javax.swing.JCheckBox checkMusic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JSlider sliderVel;
    private javax.swing.JSlider sliderVol;
    private javax.swing.JTextField txtPathSound;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
