/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mohitha
 */
public class PatientDirectory {
    private ArrayList<Patient> history;

    public PatientDirectory() {
        this.history = new ArrayList<Patient>();
        
    }   

    public ArrayList<Patient> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Patient> history) {
        this.history = history;
    }
    
    public Patient add(Patient patient){
        System.out.println("Employee Added->"+patient);
        history.add(patient); 
        return patient;
    }
    
    public void delete(int index){
        history.remove(index);
    }
    
    public void update(Patient ep){
        int index=0;
        for(Patient p:getHistory()){
            if(ep.getUserName().equals(p.getUserName())){
                history.set(index,ep);
            }
            index++;
        }
        
    }
    public void deleteAll(){
    history.removeAll(history);
    }
    
    public boolean login(String username,String password){
        boolean flag=false;
        for(Patient p:getHistory()){
            if(p.getUserName().equals(username) && p.getPassword().equals(password))
                return true;
        }
        return flag;
    }
    
    public Patient search(String username){
        Patient result = new Patient() ;
        for(Patient p:getHistory()){
            if(p.getUserName().equals(username)){
                result=p;
                break;
            }
        }
        return result;
    }
    
    
    @Override
    public String toString() {
        return "EmployeeProfileHistory{" + "history=" + history + '}';
    }
}
