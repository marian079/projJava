/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeevent;

import javax.swing.*;

public class ChangeUserPassword {
    private AuthenticationService authService;

    public ChangeUserPassword(AuthenticationService authService) {
        this.authService = authService;
    }

    public void changeUserPassword() {
        JTextField usernameField = new JTextField();
        JPasswordField oldPasswordField = new JPasswordField();
        JPasswordField newPasswordField = new JPasswordField();
        Object[] message = {
            "Username:", usernameField,
            "Old Password:", oldPasswordField,
            "New Password:", newPasswordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Change Password", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String oldPassword = new String(oldPasswordField.getPassword());
            String newPassword = new String(newPasswordField.getPassword());
            if (authService.changePassword(username, oldPassword, newPassword)) {
                JOptionPane.showMessageDialog(null, "Password changed successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or old password.");
            }
        }
    }
}