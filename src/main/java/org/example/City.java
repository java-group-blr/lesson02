package org.example;

public class City {
    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 1000000L;

    public City(){}

    public City(int population, String name){
        this.name = name;
        this.population = population;
    }

    public void printInfo() {
        System.out.println(name + population);
    }
}
