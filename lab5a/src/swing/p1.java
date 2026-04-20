package swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class p1 extends JFrame {

    JList<String> countryList;

    public p1() {

        // Frame settings
        setTitle("Country List Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        countryList = new JList<>(countries);

        // Selection mode
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries: " + selected);
                }
            }
        });

        // Add scroll pane
        JScrollPane sp = new JScrollPane(countryList);
        add(sp);

        setVisible(true);
    }

    public static void main(String[] args) {
        new p1();
    }
}





