package org.example;

public class City {
    private int population;
    private String name;

    public static final long MAX_NUMBER_OF_PEOPLE = 10000000;

    public City(int myPopulation, String myName) {
        this.population = myPopulation;
        this.name = myName;

    }

    public City() {
        this.population = 5000000;
        this.name = "Example";
    }

    public void printInfo() {
        System.out.println("City name:              " + name);
        System.out.println("The population of city: " + population);
        System.out.println("MAX population:         " + MAX_NUMBER_OF_PEOPLE );

    }

}

