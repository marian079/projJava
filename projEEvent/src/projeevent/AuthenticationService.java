/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projeevent;

public interface AuthenticationService {
    boolean register(String username, String password);
    boolean login(String username, String password);
    boolean changePassword(String username, String oldPassword, String newPassword);
    void exit();
}