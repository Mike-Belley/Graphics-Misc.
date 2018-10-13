import java.awt.*;

public class RedSnowMan {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(300, 300);
        Graphics2D g = panel.getGraphics();
        
        g.setColor(Color.RED);
        g.fillOval(50, 250, 200,50);
        g.fillOval(75, 200, 150,50);
        g.fillOval(100, 150, 100,50);
        g.fillOval(125, 100, 50,50);

    }

}
