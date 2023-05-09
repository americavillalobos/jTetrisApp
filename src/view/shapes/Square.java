/**
 * @autor Galicia Cordova Elietzer Jared
 * Fecha de creacion: 08 / 05 / 2023
 * Fecha de modificacion: 08 / 05 / 2023
 * Descripcion: Ventana de ajustes para el proyecto Tetris
 */
package view.shapes;

import java.awt.Color;
import java.awt.Graphics;
import view.PanelGame;

/**
 *
 * @author labtecweb10
 */
public class Square extends Shape {

    public Square(PanelGame game, int x, int y, Color colorBorder,
            Color colorFill) {
        super(game, x, y, colorBorder, colorFill);
        this.setCodeShape(1);
    }

    @Override
    public void draw(Graphics g) {
        // Draw fill
        g.setColor(this.getColorFill());

        g.fillRect(this.getX(), this.getY(), this.getSize(),
                this.getSize());
        
        g.fillRect(this.getX() + this.getSize(), this.getY(), 
                this.getSize(), this.getSize());
        
        g.fillRect(this.getX(), this.getY() + this.getSize(), 
                this.getSize(), this.getSize());
        
        g.fillRect(this.getX() + this.getSize(), this.getY() + this.getSize(), 
                this.getSize(), this.getSize());

        // Draw border
        g.setColor(this.getColorBorder());

        g.drawRect(this.getX(), this.getY(), this.getSize(),
                this.getSize());
        
        g.drawRect(this.getX() + this.getSize(), this.getY(), 
                this.getSize(), this.getSize());
        
        g.drawRect(this.getX(), this.getY() + this.getSize(), 
                this.getSize(), this.getSize());
        
        g.drawRect(this.getX() + this.getSize(), this.getY() + this.getSize(), 
                this.getSize(), this.getSize());
    }

}
