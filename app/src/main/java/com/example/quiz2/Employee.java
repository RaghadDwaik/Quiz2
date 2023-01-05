package com.example.quiz2;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }

    private String Name;
    private String Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }




    public Employee(String name, String salary) {
        Name = name;
        Salary = salary;
    }




}
