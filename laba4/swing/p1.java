package swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class p1 {

    p1() {

        // Create JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size (increased for large font)
        jfrm.setSize(800, 200);

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JLabel
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!", JLabel.CENTER);

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(Color.BLUE);

        // Add label to frame
        jfrm.add(jlab);

        // Make frame visible
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        // Run on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new p1();
            }
        });
    }
}