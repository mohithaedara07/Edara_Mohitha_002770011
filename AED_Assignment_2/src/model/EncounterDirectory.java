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
public class EncounterDirectory {
     private ArrayList<Encounter> history;

    public EncounterDirectory() {
        this.history = new ArrayList<Encounter>();
        
    }   
    
    

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    public Encounter add(Encounter community){
        System.out.println("Encounter Added->"+community);
        history.add(community); 
        return community;
    }
    
    public void delete(int index){
        history.remove(index);
    }
    
    public void update(Encounter ep,int index){
        history.set(index,ep);
    }
    public void deleteAll(){
    history.removeAll(history);
    }
    
    public ArrayList<Encounter> searchByPatient(String userName){
        ArrayList<Encounter> list = new ArrayList<>();
        
        for(Encounter e : getHistory()){
            if(e.getPatient().getUserName().equals(userName)){
                list.add(e);
            }
        }
        
        return list;
        
    } 
    
    public ArrayList<Encounter> searchByDoctor(String userName){
        ArrayList<Encounter> list = new ArrayList<>();
        
        for(Encounter e : getHistory()){
            if(e.getDoctor().getUserName().equals(userName)){
                list.add(e);
            }
        }
        
        return list;
        
    } 
    @Override
    public String toString() {
        return "EmployeeProfileHistory{" + "history=" + history + '}';
    }

    
    
}
