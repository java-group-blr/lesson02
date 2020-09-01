package com.company;

public class City {
    private int population;
    private String name;

    public static final long MAX_NUMBER_OF_PEOPLE=2500000;

    public City(String myName, int population) {
        this.name=myName;
        this.population=population;
    }

    public City() {
        this.name = "Minsk";
        this.population = 2300000;
    }

    public void printInfo() {

        System.out.println("My city's population is " + population);
        System.out.println("The maximum population of my City is: " + MAX_NUMBER_OF_PEOPLE);
        System.out.println("The name of my City is: " + name);

    }




}
