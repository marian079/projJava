/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeevent;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SecondFrame extends JFrame {
    private AuthenticationService authService;

    public SecondFrame(AuthenticationService authService) {
        super("Main Menu");
        this.authService = authService;
        setLayout(new GridLayout(3, 1));

        JButton categoriesButton = new JButton("Categories");
        categoriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ShowEventCategories().showEventCategories();
            }
        });
        add(categoriesButton);

        JButton myEventsButton = new JButton("My Events");
        myEventsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show My Events frame
                JOptionPane.showMessageDialog(null, "No events to display.");
            }
        });
        add(myEventsButton);

        JButton interestingEventsButton = new JButton("Interesting Events");
        interestingEventsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show Interesting Events frame
                JOptionPane.showMessageDialog(null, "No events to display.");
            }
        });
        add(interestingEventsButton);

        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}