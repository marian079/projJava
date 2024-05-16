/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeevent;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FereastraPrincipala extends JFrame{
    private AuthenticationService authService;
    private JButton b1, b2, b3;
    private ControllerButoane cb;

    public FereastraPrincipala(AuthenticationService authService) {
        super("Fereastra Principala");
        this.authService = authService;
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Center-aligned FlowLayout
        
        cb = new ControllerButoane();
        b1 = new JButton("Login");
        p.add(b1);
        b1.addActionListener(cb);
        b2 = new JButton("Creare cont");
        p.add(b2);
        b2.addActionListener(cb);
        b3 = new JButton("Ai uitat parola?");
        p.add(b3);
        b3.addActionListener(cb);
        add(p);
        // Packs the components tightly
        setLocationRelativeTo(null); // Centers the window on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        setVisible(true); // Display the frame
    }

    private class ControllerButoane implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                new LoginUser(authService, FereastraPrincipala.this).loginUser();
            }
            if (e.getSource() == b2) {
                new RegisterUser(authService).registerUser();
            }
            if (e.getSource() == b3) {
                new ChangeUserPassword(authService).changeUserPassword();
            }
        }
    }

    public static void main(String[] args) {
        AuthenticationService authService = new UserService();
        JFrame f = new FereastraPrincipala(authService);
        f.setSize(500, 75);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}