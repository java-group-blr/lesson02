package org.example;

public class City {
    private int population;

    private static final long MAX_NUMBER_OF_PEOPLE = 3222280;
    private String name;

    public void printInfo(){
        System.out.println("Название города: " + name + "\n" + "Население: " + population + "\n" + "Максимальное население: " + MAX_NUMBER_OF_PEOPLE);
    }

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public City(){
        this.name = "No Name";
        this.population = 322228;
    }
}
