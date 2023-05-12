package view.shapes;

import java.awt.Color;
import java.awt.Graphics;
import view.PanelGame;

/**
 *
 * @author labtecweb10
 */
public class Bar extends Shape {

    public Bar(PanelGame game, int x, int y, Color colorBorder, Color colorFill) {
        super(game, x, y, colorBorder, colorFill);
    }

    @Override
    public void draw(Graphics g) {
        // Draw color fill shape
        g.setColor(this.getColorFill());
        
        g.fillRect(getX(), getY(), getSize(), getSize());
        g.fillRect(getX(), getY() + getSize(), getSize(), getSize());
        g.fillRect(getX(), getY() + (getSize() * 2), getSize(), getSize());
        g.fillRect(getX(), getY() + (getSize() * 3), getSize(), getSize());
        
        // Draw border of the shape 
        g.setColor(this.getColorBorder());
        
        g.drawRect(getX(), getY(), getSize(), getSize());
        g.drawRect(getX(), getY() + getSize(), getSize(), getSize());
        g.drawRect(getX(), getY() + (getSize() * 2), getSize(), getSize());
        g.drawRect(getX(), getY() + (getSize() * 3), getSize(), getSize());
    }
    
}
