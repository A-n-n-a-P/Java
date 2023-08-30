package com.Anna.OOP.Interface.Printable;

public class PrintableRunner {
    public static void main(String[] args) {
        Printable[] printables = new Printable[5];
        printables[0] = new Book("1984");
        printables[1] = new Magazine("Код");
        printables[2] = new Book("Головоломка");
        printables[3] = new Magazine("Тошка");
        printables[4] = new Book("Странник по звездам");
        for (Printable printable : printables) {
            printable.print();
        }
        printMagazines(printables);
    }
    public static void printMagazines(Printable[] printables) {
        System.out.println();
        for (Printable printable : printables) {
            if(printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
