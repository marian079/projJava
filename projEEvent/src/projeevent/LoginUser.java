/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeevent;

import javax.swing.*;

public class LoginUser {
    private AuthenticationService authService;
    private JFrame authFrame;

    public LoginUser(AuthenticationService authService, JFrame authFrame) {
        this.authService = authService;
        this.authFrame = authFrame;
    }

    public void loginUser() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        Object[] message = {
            "Username:", usernameField,
            "Password:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (authService.login(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful.");
                authFrame.setVisible(false); // Hide the authentication frame
                new SecondFrame(authService).setVisible(true); // Show the main frame
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }
    }
}