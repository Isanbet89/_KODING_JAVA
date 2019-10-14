package User_Interface;

import javax.swing.*;
import java.awt.*;

public class FirstFormInWisard extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField textField1;
    private JButton button6;


    public FirstFormInWisard() {
        setContentPane(panel1);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FirstFormInWisard();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void setData(FirstFormInWisard data) {
    }

    public void getData(FirstFormInWisard data) {
    }

    public boolean isModified(FirstFormInWisard data) {
        return false;
    }
}
