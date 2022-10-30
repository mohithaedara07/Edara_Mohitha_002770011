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
public class HouseDirectory {
    
    private ArrayList<House> history;

    public HouseDirectory() {
        this.history = new ArrayList<House>();
        
    }   

    public ArrayList<House> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<House> history) {
        this.history = history;
    }
    
    public House add(House house){
        System.out.println("House Added->"+house);
        history.add(house); 
        return house;
    }
    
    public void delete(int index){
        history.remove(index);
    }
    
    public void update(House ep,int index){
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
