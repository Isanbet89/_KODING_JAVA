package User_Interface;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        //Create a panel
        JPanel windowContent=new JPanel();

        //Set view manager for this panel
        GridLayout gl = new GridLayout();
        windowContent.setLayout(gl);

        //Create components in memory
        JLabel label1 = new JLabel("Number1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //Add components on the panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        //Create frame and set panel for it
        JFrame frame = new JFrame("My first calculator");
        frame.setContentPane(windowContent);

        //Set size of frame and make it visible
        frame.setSize(400,100);
        frame.setVisible(true);
    }
}
