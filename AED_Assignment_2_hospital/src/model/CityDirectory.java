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
public class CityDirectory {
    
    private ArrayList<City> history;

    public CityDirectory() {
        this.history = new ArrayList<City>();
        
    }   

    public ArrayList<City> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<City> history) {
        this.history = history;
    }
    
    public City add(City city){
        System.out.println("City Added->"+city);
        history.add(city); 
        return city;
    }
    
    public void delete(int index){
        history.remove(index);
    }
    
    public void update(City ep,int index){
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
