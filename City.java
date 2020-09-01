package com.company;

public class City {
    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 5_000_000L;

    public City(int myPopulation, String myName) {
        this.population = myPopulation;
        this.name = myName;
    }

    public City() {
        this.population = 60_000;
        this.name = "Muhosransk";
    }

    public void printInfo() {
        System.out.println("Information about the City ");
        System.out.println("My City population is " + population);
        System.out.println("The maximum population of my City is: " + MAX_NUMBER_OF_PEOPLE);
        System.out.println("The name of my City is: " + name);

    }
}
