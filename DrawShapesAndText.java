// Draws a variety of shapes to demonstrate some of the 
// methods in the Graphics2D object.

import java.awt.*;

public class DrawShapesAndText 
{
    public static void main(String[] args) 
    {
        DrawingPanel panel = new DrawingPanel(300, 300);
        int x = 50;
        int y = 220;
        panel.setBackground(Color.DARK_GRAY);

        // Documentation of Graphics2D can be found at 
        //    https://docs.oracle.com/javase/7/docs/api/index.html?java/awt/Graphics2D.html
        Graphics2D g = panel.getGraphics();
        g.drawRect(150, 10, 40, 20);
        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(10)); 
        g.drawOval(110, 25, 30, 50);
        g.fillOval(150, 50, 60, 30);
        g.setColor(new Color(200,100,0));  
        g.fillRect(210, 220, 40, 50);
        g.fillRect(x, y, 40, 50);
        g.setColor(new Color(255,216,0));
        g.fillRect(x+20, y+10, 10, 20);
        g.setColor(Color.BLUE);
        g.setFont(new Font("SansSerif", Font.PLAIN, 18));
        g.drawString("Shapes and Colors", 80, 130);
    }
}