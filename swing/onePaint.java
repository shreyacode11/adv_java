import java.awt.*;
import javax.swing.*;

public class onePaint extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
     
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);
        
       
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Paint Example");
        onePaint panel = new onePaint();
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}