/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ahmad
 */
public class Admin extends User {
    public Admin(int id, String username, String password) {
        super(id, username, password, "admin");
    }

    public void manageBook() {
        
    }
}

