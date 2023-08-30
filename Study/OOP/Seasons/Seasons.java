package com.Anna.OOP.Seasons;

public enum Seasons {
    WINTER(-10),
    SPRING(14),
    SUMMER(25) {
        public String getDescriprion() {
            return "Теплое время года";
        }
    },
    AUTUMN(11);

    private double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
    public String getDescriprion() {
        return "Холодное время года";
    }
}
