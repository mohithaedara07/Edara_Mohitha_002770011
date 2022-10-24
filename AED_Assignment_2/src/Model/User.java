/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mohitha
 */
public class User {
       private String name;
    private long cellPhoneNumber;
    private String emailAddress;
    private int houseNumber;
    private String community;
    private String city;
    private int age;
    private int weight;
    private int height;
    private String userName;
    private String password;
   // private String Gender;
    //private String Roles;
    //private rolecomboboxx < String > box;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHeight() {
        return height;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public String getName() {
        return name;
        
        
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long CellPhoneNumber) {
        this.cellPhoneNumber = CellPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.emailAddress = EmailAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int HouseNumber) {
        this.houseNumber = HouseNumber;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String Community) {
        this.community = Community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int Weight) {
        this.weight = Weight;
    }

      
    
    
}
