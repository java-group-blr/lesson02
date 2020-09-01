package org.example;

public class City {
    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 500_000L;

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public City() {
        this.name="Mogilev";
        this.population = 350_000;
    }

    public void printInfo() {
        System.out.println(name+ ", " + population);
    }
}
