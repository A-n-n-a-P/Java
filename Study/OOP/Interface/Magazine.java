package com.Anna.OOP.Interface.Printable;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Print magazine: " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
