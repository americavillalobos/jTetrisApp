/* Autores: ELIETZER JARED GALICIA CORDOVA
 *          AMERICA YARIDSAIDA VILLALOBOS RODRIGUEZ
 *          MAXIMILIANO PACHECO PEREZ
 * Fecha de Creación: 27/04/2023
 * Fecha de Actualización: 04/05/2023
 * Descripción: Ventana Principal del Juego Tetris
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ListaPuntaje extends javax.swing.JFrame {

    private ImageIcon WalpaperFondoLisPunt, imgAuxIMG;
    
    public ListaPuntaje() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setSize(400, 388);
        
        // Set wallpaper
        this.WalpaperFondoLisPunt = new ImageIcon("src/images/wallpaperGeneric.jpg");
        this.imgAuxIMG = new ImageIcon(
                WalpaperFondoLisPunt.getImage().getScaledInstance(walpaper.getWidth(),
                        walpaper.getWidth(), Image.SCALE_AREA_AVERAGING));
        walpaper.setIcon(imgAuxIMG);
        
        // Set image to buttons
        ImageIcon buttonImage= new ImageIcon("src/images/botonTetris.png");
        this.imgAuxIMG = new ImageIcon(
                buttonImage.getImage().getScaledInstance(btnMenu.getWidth(),
                        btnMenu.getWidth(), Image.SCALE_AREA_AVERAGING));

        btnMenu.setIcon(imgAuxIMG);
        
        this.imgAuxIMG = new ImageIcon(
                buttonImage.getImage().getScaledInstance(btnMenu.getWidth(),
                        btnMenu.getWidth(), Image.SCALE_AREA_AVERAGING));

        btnCerrar.setIcon(imgAuxIMG);
        
        this.imgAuxIMG = new ImageIcon(
                buttonImage.getImage().getScaledInstance(btnMenu.getWidth(),
                        btnMenu.getWidth(), Image.SCALE_AREA_AVERAGING));

        btnReiniciar.setIcon(imgAuxIMG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        PanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        walpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTitulo.setBackground(new java.awt.Color(35, 100, 189));
        PanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setBackground(new java.awt.Color(63, 91, 158));
        LabelTitulo.setFont(new java.awt.Font("Waree", 0, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("FIN DEL JUEGO");
        PanelTitulo.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 0, -1, 46));

        getContentPane().add(PanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 50));

        jLabel1.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reiniciar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 354, -1, -1));

        jLabel2.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cerrar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 355, -1, -1));

        jLabel3.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menú");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 355, -1, -1));

        btnMenu.setBackground(new java.awt.Color(35, 100, 189));
        btnMenu.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 30));

        btnCerrar.setBackground(new java.awt.Color(35, 100, 189));
        btnCerrar.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 100, 30));

        btnReiniciar.setBackground(new java.awt.Color(35, 100, 189));
        btnReiniciar.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 100, 30));

        PanelLista.setBackground(new java.awt.Color(35, 100, 189));
        PanelLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBackground(new java.awt.Color(63, 147, 236));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        PanelLista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 310, 285));

        getContentPane().add(PanelLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 210));
        getContentPane().add(walpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        new Juego().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        new MenuTetris().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPuntaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel walpaper;
    // End of variables declaration//GEN-END:variables
}
