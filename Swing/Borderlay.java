package Swing;
import javax.swing.*;
import java.awt.*;

public class Borderlay {
    public static void main(String[] args ){
        
        JFrame frame = new JFrame("Border layount");

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("NORTH"),BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"),BorderLayout.SOUTH);
        frame.add(new JButton("EAST"),BorderLayout.EAST);
        frame.add(new JButton("WEST"),BorderLayout.WEST);
        frame.add(new JButton("CENTER"),BorderLayout.CENTER);

        frame.setSize(400 ,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
