package org.example;

public class City {
    private int population;

    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 10_000_000L;

    City() {
        this.population = 2_000_000;
        this.name = "Minsk";
    }

    City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Welcome to " + name);
    }
}
