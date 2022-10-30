/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mohitha
 */
public class Doctor extends Person {
    
    private String specialization;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    
    

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" + "specialization=" + specialization + ", community=" + community + '}';
    }

    

    public Doctor(String specialization, Community community, String name, int age, String gender, String emailId, long phoneNumber, String userName, String password) {
        super(name, age, gender, emailId, phoneNumber, userName, password);
        this.specialization = specialization;
        this.community = community;
    }
    
    
    public Doctor(){
    }
    
    
}
