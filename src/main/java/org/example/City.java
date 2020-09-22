package org.example;

public class City {
    public final static Long MAX_NUMBER_OF_PEOPLE = 0L;
    private int population;
    private String name;

    public City() {

    }

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name + " " + population);
    }
}
