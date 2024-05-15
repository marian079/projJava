
package projeevent;

import javax.swing.*;
public class RegisterUser {
    private AuthenticationService authService;

    public RegisterUser(AuthenticationService authService) {
        this.authService = authService;
    }

    public void registerUser() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        Object[] message = {
            "Username:", usernameField,
            "Password:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Register", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (authService.register(username, password)) {
                JOptionPane.showMessageDialog(null, "User registered successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Username already exists.");
            }
        }
    }
}
