package org.example;

public class City {
    private int population;
    private String name;
    public static final Long MAX_NUMBER_OF_PEOPLE = 750000L;


    public City(int population, String name) {
        this.population = population;
        this.name = name;

    }

    public City() {
        this.population = 510000;
        this.name = "Гомель";

    }

    public void printInfo() {
        System.out.println("Информация: ");
        System.out.println("Мой город " + name + ", в нем проживает - " + population + " человек.");
        System.out.println("Максимальновозможное количество - " + MAX_NUMBER_OF_PEOPLE +" жителей.");
    }


}