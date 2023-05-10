/* Autores: ELIETZER JARED GALICIA CORDOVA
 * Fecha de Creación: 27/04/2023
 * Fecha de Actualización: 04/05/2023
 * Descripción: Ventana Principal del Juego Tetris
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ListPoints extends javax.swing.JFrame {

    private ImageIcon WalpaperFondoLisPunt, imgAuxIMG;
    
    public ListPoints() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setSize(400, 388);
        
        // Set wallpaper
        this.WalpaperFondoLisPunt = new ImageIcon(
                "src/images/wallpaperGeneric.jpg");
        this.imgAuxIMG = new ImageIcon(
                WalpaperFondoLisPunt.getImage().getScaledInstance(
                        walpaper.getWidth(),
                        walpaper.getWidth(), 
                        Image.SCALE_AREA_AVERAGING));
        
        walpaper.setIcon(imgAuxIMG);
        
        // Set image to buttons
        ImageIcon buttonImage= new ImageIcon(
                "src/images/botonTetris.png");
        this.imgAuxIMG = new ImageIcon(
                buttonImage.getImage().getScaledInstance(
                        buttonMenu.getWidth(),
                        buttonMenu.getWidth(),
                        Image.SCALE_AREA_AVERAGING));

        buttonMenu.setIcon(imgAuxIMG);
        
        this.imgAuxIMG = new ImageIcon(
                buttonImage.getImage().getScaledInstance(
                        buttonMenu.getWidth(),
                        buttonMenu.getWidth(),
                        Image.SCALE_AREA_AVERAGING));

        buttonCerrar.setIcon(imgAuxIMG);
        
        this.imgAuxIMG = new ImageIcon(
                buttonImage.getImage().getScaledInstance(
                        buttonMenu.getWidth(),
                        buttonMenu.getWidth(), 
                        Image.SCALE_AREA_AVERAGING));

        buttonReiniciar.setIcon(imgAuxIMG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        buttonMenu = new javax.swing.JButton();
        buttonCerrar = new javax.swing.JButton();
        buttonReiniciar = new javax.swing.JButton();
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

        buttonMenu.setBackground(new java.awt.Color(35, 100, 189));
        buttonMenu.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu.setText("Menú");
        buttonMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 30));

        buttonCerrar.setBackground(new java.awt.Color(35, 100, 189));
        buttonCerrar.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        buttonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCerrar.setText("Cerrar");
        buttonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 100, 30));

        buttonReiniciar.setBackground(new java.awt.Color(35, 100, 189));
        buttonReiniciar.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        buttonReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        buttonReiniciar.setText("Reiniciar");
        buttonReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 100, 30));

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

    private void buttonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonCerrarActionPerformed

    private void buttonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReiniciarActionPerformed
        new Game().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonReiniciarActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        new MenuTetris().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenuActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPoints().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PanelLista;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonReiniciar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel walpaper;
    // End of variables declaration//GEN-END:variables
}
