/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author mohitha
 */
public class Encounter {

    private Date date;

    private VitalSigns vitalSigns;
    
    private Patient patient;
    
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Encounter(Date date, VitalSigns vitalSigns, Patient patient, Doctor doctor) {
        this.date = date;
        this.vitalSigns = vitalSigns;
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Encounter{" + "date=" + date + ", vitalSigns=" + vitalSigns + ", patient=" + patient + ", doctor=" + doctor + '}';
    }

    

    

    

}
