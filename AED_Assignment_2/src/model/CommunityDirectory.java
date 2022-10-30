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
public class CommunityDirectory {
    
    private ArrayList<Community> history;

    public CommunityDirectory() {
        this.history = new ArrayList<Community>();
        
    }   

    public ArrayList<Community> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Community> history) {
        this.history = history;
    }
    
    public Community add(Community community){
        System.out.println("Community Added->"+community);
        history.add(community); 
        return community;
    }
    
    public void delete(int index){
        history.remove(index);
    }
    
    public void update(Community ep,int index){
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
