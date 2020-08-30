package org.example;

public class City {
    private int population;
    private String name;
    private static long MAX_NUMBER_OF_PEOPLE;

    public City() {
    }

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("В РБ есть город " + name);
        System.out.println("В нем проживает " + population + " человек");
    }

}
