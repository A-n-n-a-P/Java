package com.Anna.OOP.ex;

public class Films{
    private String nameFilm;
    private int year;
    private String country;
    private String genre;
    private int cost;

    public Films(String nameFilm, int year, String country, String genre, int cost) {
        this.nameFilm = nameFilm;
        this.year = year;
        this.country = country;
        this.genre = genre;
        this.cost = cost;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGenre() {
        return genre;
    }

    public int getCost() {
        return cost;
    }
    public void print() {
        System.out.println("\nНазвание: " + nameFilm + "\nГод: " + year + "\nСтрана: " + country + "\nЖанр:" + genre + "\nСтоимость проката: " + cost);
    }
}
