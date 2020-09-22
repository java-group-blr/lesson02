package org.example;

public class City {
    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 5000000L;

    public City() {
        this.population = 60000;
        this.name = "Muhosransk";
    }
    
    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }
    
    public void printInfo() {
        System.out.println("Information about the City ");
        System.out.println("My City population is " + population + "ppl");
        System.out.println("The name of my City is: " + name);
    }
    
}
