package com.Anna.OOP.Interface.Printable;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Print book: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String PrintInfo() {
        return "Book name: " + name;
    }
}
