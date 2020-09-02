package com.company;

public class City {
    private int population;
    private String name;
    public static final Long max_number_of_people=2000000L;

    public City(int population, String name) {
        this.population=population;
        this.name=name;
    }

    public City(){
        this.population=400000;
        this.name="Brest";
    }

    public void printInfo(){
        System.out.println("City information");
        System.out.println("City name: "+name);
        System.out.println("City population: "+population);
        System.out.println("Maximum number of people in the city: "+max_number_of_people);
    }
}
