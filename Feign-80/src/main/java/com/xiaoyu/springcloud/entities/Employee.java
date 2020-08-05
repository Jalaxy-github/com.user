package com.xiaoyu.springcloud.entities;

import java.io.Serializable;

public class Employee implements Serializable {

    private int employeeId;
    private String employeeName;
    private String password;
    private String gender;
    private String departmentName;

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee() {
    }


    public Employee(int employeeId, String employeeName, String password, String gender, String departmentName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.password = password;
        this.gender = gender;
        this.departmentName = departmentName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}

