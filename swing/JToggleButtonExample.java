import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonExample {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JToggleButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        
        JToggleButton toggleButton = new JToggleButton("OFF");

       
        JLabel label = new JLabel("Button is OFF");

        
        toggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("ON");
                    label.setText("Button is ON");
                } else {
                    toggleButton.setText("OFF");
                    label.setText("Button is OFF");
                }
            }
        });

       
        frame.add(toggleButton);
        frame.add(label);

       
        frame.setVisible(true);
    }
}