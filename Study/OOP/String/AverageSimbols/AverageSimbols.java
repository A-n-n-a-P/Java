package com.Anna.OOP.String.AverageSimbols;

public class AverageSimbols {
    public static void main(String[] args) {
        String[] words = {"string", "code", "Practice"};
        for (String word : words) {
            System.out.printf("%s - %s\n", word, word.substring(word.length() / 2 - 1, word.length() / 2 + 1));
        }
    }
}
