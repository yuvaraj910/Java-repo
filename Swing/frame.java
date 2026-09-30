package Swing;
import javax.swing.*;

public class frame {
    public static void main(String[] args){
        JFrame frame = new JFrame("my swing gui");

        JLabel label = new JLabel("Hello sirrr ");

        frame.add(label);

        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
