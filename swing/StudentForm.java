import javax.swing.*;
import java.awt.event.*;
public class StudentForm {
public static void main(String[] args) {
JFrame frame = new JFrame("Student Form");
frame.setSize(400, 350);
frame.setLayout(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Name
JLabel nameLabel = new JLabel("Name:");
nameLabel.setBounds(20, 20, 100, 20);
JTextField nameField = new JTextField();
nameField.setBounds(120, 20, 200, 20);
frame.add(nameLabel);
frame.add(nameField);
// USN
JLabel usnLabel = new JLabel("USN:");
usnLabel.setBounds(20, 50, 100, 20);
JTextField usnField = new JTextField();
usnField.setBounds(120, 50, 200, 20);
frame.add(usnLabel);
frame.add(usnField);
// Section - Radio Buttons
JLabel sectionLabel = new JLabel("Section:");
sectionLabel.setBounds(20, 80, 100, 20);
JRadioButton secA = new JRadioButton("4A");
JRadioButton secB = new JRadioButton("4B");
JRadioButton secC = new JRadioButton("4C");
secA.setBounds(120, 80, 50, 20);
secB.setBounds(180, 80, 50, 20);
secC.setBounds(240, 80, 50, 20);
ButtonGroup sectionGroup = new ButtonGroup();
sectionGroup.add(secA);
sectionGroup.add(secB);
sectionGroup.add(secC);
frame.add(sectionLabel);
frame.add(secA);
frame.add(secB);
frame.add(secC);

// Languages - Checkboxes
JLabel langLabel = new JLabel("Languages:");
langLabel.setBounds(20, 110, 100, 20);
JCheckBox c = new JCheckBox("C");
JCheckBox cpp = new JCheckBox("C++");
JCheckBox py = new JCheckBox("Python");
JCheckBox java = new JCheckBox("Java");
JCheckBox html = new JCheckBox("HTML");
c.setBounds(120, 110, 60, 20);
cpp.setBounds(180, 110, 60, 20);
py.setBounds(240, 110, 80, 20);
java.setBounds(120, 140, 80, 20);
html.setBounds(200, 140, 80, 20);
frame.add(langLabel);
frame.add(c);
frame.add(cpp);
frame.add(py);
frame.add(java);
frame.add(html);
// Submit Button
JButton submit = new JButton("Submit");
submit.setBounds(130, 180, 100, 30);
frame.add(submit);
// Message Label
JLabel message = new JLabel("");
message.setBounds(20, 230, 350, 30);
frame.add(message);
// Action
submit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int count = 0;
if (c.isSelected()) count++;
if (cpp.isSelected()) count++;
if (py.isSelected()) count++;
if (java.isSelected()) count++;
if (html.isSelected()) count++;
if (count >= 2) {
message.setText("Successfully completed  Advanced Java.");
} else {
message.setText("Please select exactly two languages.");
}
}
});
frame.setVisible(true);
}
}