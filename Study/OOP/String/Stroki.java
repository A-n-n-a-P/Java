package com.Anna.OOP.String;

public class Stroki {
    public static void main(String[] args) {
        String str1 = "I like Java!!!";
        printStroka(str1);
        printEnd(str1);
        Proverka(str1);
        printStart(str1);
        printContainns(str1);
        printPoz(str1);
        printReplace(str1);
        printUp(str1);
        printLow(str1);

    }
    public static void printStroka(String str1){
        //String str2 = str1;
        System.out.println(str1);
    }
    public static void printEnd(String str1){
        System.out.println("Строка оканчивается на " + str1.charAt(str1.length()-1));
    }
    public static void Proverka(String str1){
        boolean end = str1.endsWith("!!!");
        if(end == true){
            System.out.println("Строка заканчивается на '!!!'");
        }
        else System.out.println("Строка НЕ заканчивается на '!!!'");
    }
    public static void printStart(String str1){
        boolean start = str1.startsWith("I like");
        if(start == true){
            System.out.println("Строка начинается на 'I like'");
        }
        else System.out.println("Строка НЕ начинается на 'I like'");
    }
    public static void printContainns(String str1){
        boolean con = str1.contains("Java");
        if(con == true){
            System.out.println("Строка содержит слово 'Java'");
        }
        else System.out.println("Строка НЕ содержит слово 'Java'");
    }
    public static void printPoz(String str1){
        System.out.println(str1.indexOf("Java"));
    }
    public static void printReplace(String str1){
        System.out.println(str1.replace('a', 'o'));
    }
    public static void printUp(String str1){
        System.out.println(str1.toUpperCase());
    }
    public static void printLow(String str1){
        System.out.println(str1.toLowerCase());
    }
}
