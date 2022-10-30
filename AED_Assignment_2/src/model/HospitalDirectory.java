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
public class HospitalDirectory {
    private ArrayList<Hospital> history;

    public HospitalDirectory() {
        this.history = new ArrayList<Hospital>();
        
    }   

    public ArrayList<Hospital> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Hospital> history) {
        this.history = history;
    }
    
    public Hospital add(Hospital hospital){
        System.out.println("Hospital Added->"+hospital);
        history.add(hospital); 
        return hospital;
    }
    
    public void delete(int index){
        history.remove(index);
    }
    
    public void update(Hospital ep,int index){
        history.set(index,ep);
    }
    public void deleteAll(){
    history.removeAll(history);
    }
    @Override
    public String toString() {
        return "EmployeeProfileHistory{" + "history=" + history + '}';
    }
}
