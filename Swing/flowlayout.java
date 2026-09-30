package Swing;
import javax.swing.*;
import java.awt.*;

public class flowlayout {
    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        panel.add(new JButton("one"));
        panel.add(new JButton("two"));
        panel.add(new JButton("three"));

        frame.add(panel);

        frame.setSize(400 ,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
