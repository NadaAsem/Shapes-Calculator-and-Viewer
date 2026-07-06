package faculty.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class GUI extends JPanel {

    private final Shape shape;

    public GUI(Shape shape) {
        this.shape = shape; 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (shape instanceof Cube) {
            Cube cube = (Cube) shape;
            int side = (int) cube. getside();
            int dimension = side / 3;
            int x1 = 150;
            int y1 = 150;
            int x2 = x1 + dimension;
            int y2 = y1 - dimension;

          
            g2d.setColor(Color.BLUE);
            g2d.fillRect(x2, y2, side, side);

            
            g2d.setColor(Color.GREEN);
            g2d.fillRect(x1, y1, side, side);

            
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x1, y1, side, side);
            g2d.drawRect(x2, y2, side, side);
            g2d.drawLine(x1, y1, x2, y2);
            g2d.drawLine(x1 + side, y1, x2 + side, y2);
            g2d.drawLine(x1, y1 + side, x2, y2 + side);
            g2d.drawLine(x1 + side, y1 + side, x2 + side, y2 + side);

        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            int radius = (int) circle. getReduis();
            
            g2d.setColor(Color.GREEN);
            g2d.fillOval(150, 100, radius * 2, radius * 2); 

            g2d.setColor(Color.BLACK);
            g2d.drawOval(150, 100, radius * 2, radius * 2);
        }
    }
}