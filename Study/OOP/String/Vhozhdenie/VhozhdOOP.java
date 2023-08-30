package com.Anna.OOP.String.Vhozhdenie;

public class VhozhdOOP {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String str1 = "(?i)object\\s*oriented\\s*programming";
        str = str.replaceAll(str, "OOP");
        System.out.println(str1);
    }
}
