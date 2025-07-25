import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select your favorite programming languages:");

        
        JCheckBox cbC = new JCheckBox("C");
        JCheckBox cbCpp = new JCheckBox("C++");
        JCheckBox cbJava = new JCheckBox("Java");
        JCheckBox cbPython = new JCheckBox("Python");

        
        JButton submitButton = new JButton("Submit");

        
        JLabel resultLabel = new JLabel("");

        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedLanguages = new StringBuilder("Selected: ");

                if (cbC.isSelected()) selectedLanguages.append("C ");
                if (cbCpp.isSelected()) selectedLanguages.append("C++ ");
                if (cbJava.isSelected()) selectedLanguages.append("Java ");
                if (cbPython.isSelected()) selectedLanguages.append("Python ");

                
                resultLabel.setText(selectedLanguages.toString());
            }
        });

       
        frame.add(label);
        frame.add(cbC);
        frame.add(cbCpp);
        frame.add(cbJava);
        frame.add(cbPython);
        frame.add(submitButton);
        frame.add(resultLabel);

       
        frame.setVisible(true);
    }
}