/*****************************************************
*Autor:America Yaridsaida Villalobos Rodríguez       *
* Fecha de creación: 01/05/2023                      *
* Fecha de actualización: 04/05/2023                 *
* Descripción:Esta es la ventana menú que llevara al *
* usuario a donde quiera ir en el juego              *
******************************************************/
package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelGame extends JPanel {

    private int width;
    private int heigth;

    public PanelGame(int width, int heigth) {
//		this.initComponents();

        this.width = width;
        this.heigth = heigth;

        this.setSize(width, heigth);
        this.setBackground(new Color(25, 25, 25));
//		this.setBorder(BasicBorders.getButtonBorder());
    }

    // Add code for components
    private void initComponents() {
    }

    // Draw grid and set color
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(220, 220, 220, 150));

        // Create grid in the panel
        for (int i = 0; i < this.getWidth(); i += 20) {
            g.drawLine(i, 0, i, this.getHeight());
        }
        for (int i = 0; i < this.getHeight(); i += 20) {
            g.drawLine(0, i, this.getWidth(), i);
        }
        System.out.println("panel");
    }
}
