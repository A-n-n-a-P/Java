package com.Anna.OOP.Seasons;

public class SeasonsRunner {
    public static void main(String[] args) {
        Seasons favouriteseason = Seasons.SPRING;
        System.out.println(favouriteseason);
        InfoSeason(favouriteseason);
        AllInfoSeason();

        //Seasons season;

    }
    public static void InfoSeason(Seasons favouriteseason) {
        switch (favouriteseason) {
            case WINTER -> System.out.println("I like winter");
            case SPRING -> System.out.println("I like spring");
            case SUMMER -> System.out.println("I like summer");
            case AUTUMN -> System.out.println("I like autumn");
        }
    }

    public static void AllInfoSeason() {
        for (Seasons s : Seasons.values()) {
            System.out.println("Средняя температура: " + s + "\t|\t" + s.getAverageTemperature() + "\t| " + s.getDescriprion());
        }
    }

    public static String getDescriprion(Seasons favouriteseason) {
        return "Холодное время года";
    }
}
