package com.Anna.OOP.String.Employees;

public class EmloyeeRunner {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 45000),
                new Employee("Петров Петр Петрович", 30000),
                new Employee("Олегов Олег Олегович", 25000),
        };
        Report.generateReport(employees);
        FullReport.generateFullReport(employees);
    }
}
