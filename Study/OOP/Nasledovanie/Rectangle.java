package com.Anna.OOP.Nasledovanie;

public class Rectangle extends Pair {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public void printAllInfo() {
        System.out.println("Длина: " + length + "\nШирина: " + width + "\nПлощадь треугольника: " + SquareTriangle() + "\nПериметр треугольника: " + PerimeterTriangle());
    }

    public double SquareTriangle() {
        double square = ProductofNambers() / 2;
        return square;
    }

    public double PerimeterTriangle() {
        double perimeter = Math.sqrt(Math.pow((double)length, 2) + Math.pow((double)width, 2));
        return perimeter;
    }
}
