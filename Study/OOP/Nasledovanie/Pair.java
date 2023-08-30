package com.Anna.OOP.Nasledovanie;

public class Pair {
    protected int length;
    protected int width;

    public Pair(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double ProductofNambers() {
       return length * width;
    }
}
