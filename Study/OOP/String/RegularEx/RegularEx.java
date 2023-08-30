package com.Anna.OOP.String.RegularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {
    public static void main(String[] args) {
        /*Задание 7
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);
        System.out.println();
        Задание 8
        System.out.println(test("google.com"));
        System.out.println(test("reference1.dfg"));
        System.out.println(test("reference1.org"));
        System.out.println();
        Задание 9*/
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";

        Pattern pattern1 = Pattern.compile("Java\\s+\\d{1,2}");
        Matcher matcher = pattern1.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    //Задание 8
    /*public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }*/
}
