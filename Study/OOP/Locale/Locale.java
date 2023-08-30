package com.Anna.OOP.Locale;

import java.util.Locale;

public class Locale {

 public static void main(String[] args) {
            Locale it = Locale.ITALY;
            Locale kor = Locale.KOREA;
            Locale en = new Locale("en", "US");
            getInfo(it);
            getInfo(kor);
            getInfo(en);

            Locale.setDefault(Locale.CANADA);
            Locale current = Locale.getDefault();
            getInfo(current);

        }
        public static void getInfo(Locale con){
            System.out.println("Код региона: " + con.getCountry());
            System.out.println("Название региона: " + con.getDisplayCountry());
            System.out.println("Код языка региона: " + con.getLanguage());
            System.out.println("Название языка региона: " + con.getDisplayLanguage());
            System.out.println();
    }
}
