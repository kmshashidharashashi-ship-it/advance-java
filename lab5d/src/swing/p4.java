package swing;

import javax.swing.*;
import java.awt.*;

public class p4 extends JFrame {

    public p4() {

        // Frame settings
        setTitle("Tabbed Pane Colors");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Add to frame
        add(tabbedPane);

        // Make visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new p4();
    }
}

