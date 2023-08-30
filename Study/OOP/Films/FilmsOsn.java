package com.Anna.OOP.ex;

public class FilmsOsn {
    public static void main(String[] args) {
        Films[] films = {
                new Films("Игры разума", 2001, "США", "Драма", 313000000),
                new Films("Сплит", 2016, "США", "Триллер", 75000000),
                new Films("Оно", 2017, "США", "Ужасы", 35000000),
                new Films("",0,"","",0)
        };
        for (int i = 0; i < films.length-1; i++) {
            films[i].print();
        }
        System.out.println("\nФильмы со стоимостью выше средней");
        int averageCost = 0;
        for (int i = 0; i < films.length-1; i++) {
            averageCost += films[i].getCost();
        } averageCost /= films.length;

        for (int i = 0; i < films.length - 2; i++) {
            if(films[i].getCost() > averageCost){
                films[i].print();
            }
        }

        System.out.println("\nРанний год выпуска");
        ForYear(films);

        System.out.println("\nФильмы, упорядоченные по названию");
        ForSort(films);
    }

    public static void ForYear(Films[] films) {
        int earlyYear = films[0].getYear();
        int imin = 0;
        for (int i = 1; i < films.length - 1; i++) {
            if(films[i].getYear() < earlyYear) {
                imin = i;
                earlyYear = films[i].getYear();
            }
        }
        films[imin].print();
    }

    public static void ForSort(Films[] films) {
        for (int i = 1; i < films.length - 1; i++) {
            if(films[i-1].getNameFilm().charAt(0) > films[i].getNameFilm().charAt(0)) {
                films[films.length-1] = films[i];
                films[i] = films[i-1];
                films[i-1] = films[films.length-1];
            }
        }
        for (int i = 0; i < films.length - 1; i++){
            films[i].print();
        }
    }
}