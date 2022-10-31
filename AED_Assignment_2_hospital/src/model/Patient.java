/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mohitha
 */
public class Patient extends Person {

    private String disease;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Patient(String disease, String name, int age, String gender, String emailId, long phoneNumber, String userName, String password) {
        super(name, age, gender, emailId, phoneNumber, userName, password);
        this.disease = disease;

    }

    public Patient() {
        this.disease="";
    }

    @Override
    public String toString() {
        return "Patient{" + "disease=" + disease + '}';
    }

}
