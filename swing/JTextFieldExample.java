import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldExample {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

       
        JTextField textField = new JTextField(20); // 20 columns wide

       
        JLabel label = new JLabel("Enter text and click the button");

       
        JButton button = new JButton("Show Text");

       
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText(); 
                label.setText("You entered: " + text); 
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label);


        frame.setVisible(true);
    }
}