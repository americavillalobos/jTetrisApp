/* Autores: ELIETZER JARED GALICIA CORDOVA
 *          AMERICA YARIDSAIDA VILLALOBOS RODRIGUEZ
 *          MAXIMILIANO PACHECO PEREZ
 * Fecha de Creación: 27/04/2023
 * Fecha de Actualización: 04/05/2023
 * Descripción: Ventana Principal del Juego Tetris
 */
package view;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Game extends javax.swing.JFrame {

    private ImageIcon iWalpaper, iAuxIMG;
    private PanelGame panelJuego;

    public Game() {

        // Create panel the game
        panelJuego = new PanelGame(500, 700);
        panelJuego.setBounds(300, 100, 500, 700);
        this.add(panelJuego);
        initComponents();

        this.setLocationRelativeTo(null);
        this.iWalpaper = new ImageIcon("src/images/WalpaperJuego.jpg");
        this.iAuxIMG = new ImageIcon(
                iWalpaper.getImage().getScaledInstance(walpaper.getWidth(), walpaper.getWidth(), Image.SCALE_AREA_AVERAGING)
        );

        walpaper.setIcon(iAuxIMG);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Siguiete = new javax.swing.JPanel();
        LabelSiguiente = new javax.swing.JLabel();
        RecuadroSiguiente = new javax.swing.JPanel();
        Tiempo = new javax.swing.JPanel();
        LabelTiempo = new javax.swing.JLabel();
        RecuadroTiempo = new javax.swing.JPanel();
        Puntuacion = new javax.swing.JPanel();
        LabelPuntuacion = new javax.swing.JLabel();
        RecuadroPuntuacion = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        Minimizar = new javax.swing.JButton();
        walpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Siguiete.setBackground(new java.awt.Color(35, 71, 155));
        Siguiete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelSiguiente.setBackground(new java.awt.Color(204, 255, 255));
        LabelSiguiente.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        LabelSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        LabelSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSiguiente.setText("SIGUIENTE");
        LabelSiguiente.setToolTipText("");
        Siguiete.add(LabelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 150, 25));

        RecuadroSiguiente.setBackground(new java.awt.Color(63, 91, 158));
        RecuadroSiguiente.setPreferredSize(new java.awt.Dimension(0, 110));
        RecuadroSiguiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Siguiete.add(RecuadroSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, 150, -1));

        getContentPane().add(Siguiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, -1));

        Tiempo.setBackground(new java.awt.Color(35, 71, 155));
        Tiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTiempo.setBackground(new java.awt.Color(204, 255, 255));
        LabelTiempo.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        LabelTiempo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTiempo.setText("TIEMPO");
        LabelTiempo.setToolTipText("");
        Tiempo.add(LabelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 25));

        RecuadroTiempo.setBackground(new java.awt.Color(63, 91, 158));
        RecuadroTiempo.setPreferredSize(new java.awt.Dimension(0, 110));
        RecuadroTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Tiempo.add(RecuadroTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, 148, 70));

        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 160, -1));

        Puntuacion.setBackground(new java.awt.Color(35, 71, 155));
        Puntuacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelPuntuacion.setBackground(new java.awt.Color(204, 255, 255));
        LabelPuntuacion.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        LabelPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        LabelPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPuntuacion.setText("PUNTUACIÓN");
        LabelPuntuacion.setToolTipText("");
        Puntuacion.add(LabelPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 148, 25));

        RecuadroPuntuacion.setBackground(new java.awt.Color(63, 91, 158));
        RecuadroPuntuacion.setPreferredSize(new java.awt.Dimension(0, 110));
        RecuadroPuntuacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Puntuacion.add(RecuadroPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, 148, 70));

        getContentPane().add(Puntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, 160, -1));

        Panel.setBackground(new java.awt.Color(107, 161, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setText("X");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        Minimizar.setText("-");
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 0, -1, -1));

        Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        walpaper.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        walpaper.setPreferredSize(new java.awt.Dimension(840, 840));
        Panel.add(walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 860, 860));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setExtendedState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel LabelPuntuacion;
    private javax.swing.JLabel LabelSiguiente;
    private javax.swing.JLabel LabelTiempo;
    private javax.swing.JButton Minimizar;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Puntuacion;
    private javax.swing.JPanel RecuadroPuntuacion;
    private javax.swing.JPanel RecuadroSiguiente;
    private javax.swing.JPanel RecuadroTiempo;
    private javax.swing.JPanel Siguiete;
    private javax.swing.JPanel Tiempo;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel walpaper;
    // End of variables declaration//GEN-END:variables
}
