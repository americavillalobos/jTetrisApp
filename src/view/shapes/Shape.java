/**
 * @autor Galicia Cordova Elietzer Jared
 * Fecha de creacion: 08 / 05 / 2023
 * Fecha de modificacion: 08 / 05 / 2023
 * Descripcion: Clase padre de las figuras en el juego
 */
package view.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import view.PanelGame;

/**
 *
 * @author Galicia Cordova Elietzer Jared
 */
public abstract class Shape {
    
    // Properties
    // size and position
    private final int size = 20;
    private int codeShape;
    private int x;
    private int y;
    private PanelGame game;
    
    private boolean status;
    
    // R moving
    private final int dx = size;
    private final int dy = size;
    
    // Apariencie
    private Color colorBorder;
    private Color colorFill;

    public Shape(PanelGame game, int x, int y, Color colorBorder,              
        Color colorFill) {
        this.x = x;
        this.y = y;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
        this.game = game;
        
        this.setStatus(true);
    }

    // Setters and geters
    public int getCodeShape() {
        return codeShape;
    }
    
    public void setCodeShape(int codeShape) {
        this.codeShape = codeShape;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public Color getColorFill() {
        return colorFill;
    }

    public void setColorFill(Color colorFill) {
        this.colorFill = colorFill;
    }
    
    /**
     * 
     * @param g for draw shape on panel
     * 
     */
    public abstract void draw(Graphics g);
    
    public void move(Rectangle limits) {
        
        // Compare if this shape is moving
        if (getStatus()) {
            
            if (this.getX() < limits.getMaxX()) {
                x += dx;
            }
            
            if (this.getY() < limits.getMaxY()) {
                y += dy;
            } else {
                this.setStatus(false);
            }           
            
        }
    }
}
