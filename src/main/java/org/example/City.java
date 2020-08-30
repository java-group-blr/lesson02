package org.example;

public class City {
    private int population;
    private String name;
    private static final Long MAX_NUMBER_OF_PEOPLE = 3000000L;

    public City() {
        this.population = 100000;
        this.name = "Fanipol-sity";
    }

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("В РБ есть город " + name);
        System.out.println("В нем проживает " + population + " человек");
    }

}
