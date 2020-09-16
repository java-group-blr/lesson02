package org.example;

public class City {

    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 50000000L;

    public City(int population, String name) {

        this.population = population;
        this.name = name;

    }

    public City (){
        this.population = 4600000;
        this.name = "Tokyo";

    }
    public void printInfo (){
        System.out.println ("Сейчас в этом городе: " + population + "людей");
        System.out.println ("А когда-то людей было: " + MAX_NUMBER_OF_PEOPLE);
        System.out.println ("А город этот называется " + name);
    }

}
