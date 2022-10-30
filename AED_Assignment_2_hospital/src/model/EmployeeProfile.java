/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mohitha
 */
public class EmployeeProfile {
    
    private String name ;
    private int employeeId;
    private int age; 
    private String gender ;
    private Date startDate ;
    private int level ;
    private String teamInfo ;
    private String positionTitle ;
    private Image photo;
    private long cellPhoneNumber;
    private String emailAddress;
    
    
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    
    
    
    @Override
    public String toString() {
        return "EmployeeProfile{" + "name=" + name + ", employeeId=" + employeeId + ", age=" + age + ", gender=" + gender + ", startDate=" + startDate + ", level=" + level + ", teamInfo=" + teamInfo + ", positionTitle=" + positionTitle + ", photo=" + photo + ", cellPhoneNumber=" + cellPhoneNumber + ", emailAddress=" + emailAddress + ", dateFormat=" + dateFormat + '}';
    }

    

    public EmployeeProfile(String name, int employeeId, int age, String gender, Date startDate, int level, String teamInfo, String positionTitle, int cellPhoneNumber, String emailAddress) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.gender = gender;
        this.startDate = startDate;
        this.level = level;
        this.teamInfo = teamInfo;
        this.positionTitle = positionTitle;
        this.cellPhoneNumber = cellPhoneNumber;
        this.emailAddress = emailAddress;
    }

    public EmployeeProfile() {
    }
    
    
    
}
