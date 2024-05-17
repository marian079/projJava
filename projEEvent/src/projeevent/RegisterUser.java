
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
            "Parola:", passwordField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Înregistrare", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (authService.register(username, password)) {
                JOptionPane.showMessageDialog(null, "Utilizatorul s-a inregistrat cu succes!");
            } else {
                JOptionPane.showMessageDialog(null, "Username exista deja!");
         
            }
        }
    }
}
