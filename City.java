package org.example;

public class City {
    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 700000L;

    public City() {
     this.population = 20000;
     this.name = "Minsk";
    }

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("City info ");
        System.out.println("City population: " + this.population);
        System.out.println("City name: " + this.name);

    }
}
