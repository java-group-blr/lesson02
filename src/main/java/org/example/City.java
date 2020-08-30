package org.example;

public class City {
    private int population;
    private String name;
    public final Long MAX_NUMBER_OF_PEOPLE = 10000L;

    public City() {
        this.population = 15600;
        this.name = "Minsk";
    }

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("My city - " + this.name);
        System.out.println("City population - " + this.population);
    }


}
