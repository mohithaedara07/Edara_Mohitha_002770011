/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author mohitha
 */
public class UserRecord {
    private ArrayList<User> user;
    
    public UserRecord(){
        this.user=new ArrayList<User>();
        
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setEmployee(ArrayList<User> user) {
        this.user = user;
    }
    
    public User addNewUser(){
        
        User newUser = new User();
       user.add(newUser);
       return newUser;
    }

    public void deleteUsers(User usr) {
        user.remove(usr);
        
    }
}
