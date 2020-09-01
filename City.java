package com.company;

public class City {
    private final int population;
    private final String name;

    public static final Long MAX_NUMBER_OF_PEOPLE=2500000L;

    public City(int population, String name) {
        this.population=population;
        this.name=name;

    }

    public City() {
        this.population = 2300000;
        this.name = "Minsk";

    }

    public void printInfoCity() {

        System.out.println("Information about the city:");
        System.out.println("My city's population is " + population);
        System.out.println("The maximum population of my City is: " + MAX_NUMBER_OF_PEOPLE);
        System.out.println("The name of my City is: " + name);

    }




}
