import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JRadioButton Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

       
        JLabel label = new JLabel("Select your gender:");

       
        JRadioButton rbMale = new JRadioButton("Male");
        JRadioButton rbFemale = new JRadioButton("Female");
        JRadioButton rbOther = new JRadioButton("Other");

       
        ButtonGroup group = new ButtonGroup();
        group.add(rbMale);
        group.add(rbFemale);
        group.add(rbOther);

     
        JButton submitButton = new JButton("Submit");

       
        JLabel resultLabel = new JLabel("");

       
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedGender = "Selected: ";
                if (rbMale.isSelected()) {
                    selectedGender += "Male";
                } else if (rbFemale.isSelected()) {
                    selectedGender += "Female";
                } else if (rbOther.isSelected()) {
                    selectedGender += "Other";
                } else {
                    selectedGender += "None";
                }

                
                resultLabel.setText(selectedGender);
            }
        });

        frame.add(label);
        frame.add(rbMale);
        frame.add(rbFemale);
        frame.add(rbOther);
        frame.add(submitButton);
        frame.add(resultLabel);

        
        frame.setVisible(true);
    }
}