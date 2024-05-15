/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeevent;

import java.util.HashMap;
import java.util.Map;

public class UserService implements AuthenticationService {
    private Map<String, User> users = new HashMap<>();

    @Override
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        users.put(username, new User(username, password));
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user == null) {
            return false; // User not found
        }
        return user.getPassword().equals(password);
    }

    @Override
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        User user = users.get(username);
        if (user == null || !user.getPassword().equals(oldPassword)) {
            return false; // User not found or old password does not match
        }
        users.put(username, new User(username, newPassword));
        return true;
    }

    @Override
    public void exit() {
        System.out.println("Exiting the system...");
        System.exit(0);
    }

    public void listUsers() {
        for (String username : users.keySet()) {
            System.out.println(username);
        }
    }
}
