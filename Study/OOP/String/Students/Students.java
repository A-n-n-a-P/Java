package com.Anna.OOP.String.Students;

import java.util.Formatter;

public class Students {
    public static void main(String[] args) {
        PrintInfo("Иванов", 5, "математике");
        PrintInfo("Петрова", 4, "физике");
        PrintInfo("Сидорова", 5, "программированию");
    }
    public static void PrintInfo(String surname, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %-15s получил %-3s по %-10s", surname, mark, subject);
        System.out.println(formatter);
    }
}
