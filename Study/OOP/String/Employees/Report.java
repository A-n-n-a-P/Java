package com.Anna.OOP.String.Employees;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("\t\t\t\tФИО\t\t\t   %-11s%n", "Оклад, руб");
        System.out.printf("-----------------------------------------%n");
        for (Employee employee : employees) {
            String[] fio = employee.getFullname().split("\\s+");
            System.out.printf("  %s\t%s\t%-8s  %10.2f  %n", fio[0], fio[1], fio[2], employee.getSalary());
            System.out.printf("-----------------------------------------%n");

        }
        System.out.println();
    }
}
class FullReport {
    public static void generateFullReport(Employee[] employees) {
        System.out.printf("\t\t\t\tФИО\t\t\t   %-11s  %-12s%n", "Оклад, руб", "Дата з/п");
        System.out.printf("-----------------------------------------------------%n");
        for (Employee employee : employees) {
            String[] fio = employee.getFullname().split("\\s+");
            System.out.printf("  %s\t%s\t%-8s  %10.2f    %d.%d.%d %n", fio[0], fio[1], fio[2], employee.getSalary(), employee.getSalaryDate().getDayOfMonth(), employee.getSalaryDate().getMonthValue(), employee.getSalaryDate().getYear());
            System.out.printf("-----------------------------------------------------%n");
        }
    }
}
