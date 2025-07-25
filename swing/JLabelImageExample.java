import java.awt.*;
import javax.swing.*;

public class JLabelImageExample {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JLabel and ImageIcon Example");
        frame.setSize(600, 400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

       
        JLabel textLabel = new JLabel("Hello, Swing!");

       
        ImageIcon icon = new ImageIcon("example.png"); 

        // Resize the image to fit the JLabel
        Image img = icon.getImage(); // Get the image from the ImageIcon
        Image scaledImg = img.getScaledInstance(600, 400, Image.SCALE_SMOOTH); // Resize to fit frame size
        ImageIcon resizedIcon = new ImageIcon(scaledImg); // Create a new ImageIcon with the resized image

   
        JLabel imageLabel = new JLabel(resizedIcon);

       
        frame.add(textLabel);
        frame.add(imageLabel);

  
        frame.setVisible(true);
    }
}

