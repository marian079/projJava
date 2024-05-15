/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowEventCategories {
    private String[] categories = {"muzica", "inaugurari", "lansare de carte", "sportiv", "expozitii de arta", "serbare", "teatru"};

    public void showEventCategories() {
        JFrame categoryFrame = new JFrame("Event Categories");
        categoryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        categoryFrame.setLayout(new GridLayout(categories.length, 1));

        for (String category : categories) {
            JButton categoryButton = new JButton(category);
            categoryButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle category button click
                    JOptionPane.showMessageDialog(null, "No events in category: " + category);
                }
            });
            categoryFrame.add(categoryButton);
        }

        categoryFrame.pack();
        categoryFrame.setLocationRelativeTo(null); // Center the frame
        categoryFrame.setVisible(true);
    }
}