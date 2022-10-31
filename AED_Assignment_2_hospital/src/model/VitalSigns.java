/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mohitha
 */
public class VitalSigns {
    
    private int heartRate;
    private int weight;
    private int height;

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public VitalSigns(int heartRate, int weight, int height) {
        this.heartRate = heartRate;
        this.weight = weight;
        this.height = height;
    }

    public VitalSigns() {
        this.heartRate = 0;
        this.weight = 0;
        this.height = 0;
    }
    
    

    @Override
    public String toString() {
        return "VitalSigns{" + "heartRate=" + heartRate + ", weight=" + weight + ", height=" + height + '}';
    }
    
    
    
}
