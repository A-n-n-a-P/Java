package com.Anna.OOP.String.Employees;

import java.time.LocalDate;

public class Employee{
    private String fullname;
    private double salary;
    static LocalDate salaryDate = LocalDate.of(2022, 06,10);

    public Employee(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }
}
