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
public class EmployeeRecord {
    private ArrayList<Employee> employee;
    
    public EmployeeRecord(){
        this.employee=new ArrayList<Employee>();
        
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }
    
    public Employee addNewEmployee(){
        
        Employee newEmployee = new Employee();
       employee.add(newEmployee);
       return newEmployee;
    }

    public void deleteEmployees(Employee emp) {
        employee.remove(emp);
        
    }
    
    
}
