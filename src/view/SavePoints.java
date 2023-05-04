/**
 * @autor Galicia Cordova Elietzer Jared
 * Fecha de creacion: 27 / 04 / 2023
 * Fecha de modificacion: 04 / 05 / 2023
 * Descripcion: Ventana para guardar un nuevo puntaje
 *  para el proyecto Tetris
 */

package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author labtecweb07
 */
public class SavePoints extends javax.swing.JFrame {

    /**
     * Creates new form GuardarPuntaje
     */
    public SavePoints() {
        initComponents();
        // Set properties to window
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(400, 300);
        this.setTitle("Registrar puntaje");

        // Set images to wallpaper and buttons
        ImageIcon imagen = new ImageIcon("./src/images/wallpaperGeneric.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));
        wallpaper.setIcon(icono);

        ImageIcon imagen2 = new ImageIcon("./src/images/botonTetris.png");
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(buttonOk.getWidth(),
                buttonOk.getHeight(), Image.SCALE_DEFAULT));
        buttonOk.setIcon(icono2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        buttonMin = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        txtPathMusic = new javax.swing.JTextField();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(63, 91, 158));
        jLabel2.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("000,000,000");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO PUNTAJE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGRESA TÚ NOMBRE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("OK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 253, -1, -1));

        buttonOk.setBackground(new java.awt.Color(63, 91, 158));
        buttonOk.setForeground(new java.awt.Color(255, 255, 255));
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });
        getContentPane().add(buttonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 80, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonMin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonMin.setForeground(new java.awt.Color(255, 255, 255));
        buttonMin.setText("-");
        buttonMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMinMouseExited(evt);
            }
        });
        buttonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMinActionPerformed(evt);
            }
        });
        jPanel4.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 0, -1, 37));

        buttonClose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonClose.setForeground(new java.awt.Color(255, 255, 255));
        buttonClose.setText("X");
        buttonClose.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        jPanel4.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 37));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 37));

        txtPathMusic.setBackground(new java.awt.Color(102, 153, 255));
        txtPathMusic.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        txtPathMusic.setForeground(new java.awt.Color(255, 255, 255));
        txtPathMusic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPathMusic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPathMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 220, 30));
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
       
        new ListPoints().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonOkActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseEntered
        this.buttonClose.setForeground(Color.red);
    }//GEN-LAST:event_buttonCloseMouseEntered

    private void buttonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseExited
        this.buttonClose.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonCloseMouseExited

    private void buttonMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseEntered
        this.buttonMin.setForeground(Color.red);
    }//GEN-LAST:event_buttonMinMouseEntered

    private void buttonMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinMouseExited
        this.buttonMin.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonMinMouseExited

    private void buttonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMinActionPerformed
        this.setExtendedState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_buttonMinActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // Move window with mouse
        Point punto = MouseInfo.getPointerInfo().getLocation();
        System.out.println("x : " + punto.x + "y; " + punto.y);
        this.setLocation(punto);
    }//GEN-LAST:event_jPanel4MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SavePoints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonMin;
    private javax.swing.JButton buttonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtPathMusic;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
