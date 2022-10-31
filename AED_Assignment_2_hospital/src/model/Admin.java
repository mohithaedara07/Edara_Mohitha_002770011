/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mohitha
 */
public class Admin extends Person {
    
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Admin(String role,String name, int age, String gender, String emailId, long phoneNumber, String userName, String password) {
        super( name,  age,  gender,  emailId,  phoneNumber,  userName,  password);
        this.role = role;
    }

    public Admin() {
    }
    
    
    
}
