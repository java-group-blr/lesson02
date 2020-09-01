package org.example;

public class City {
    private int population;
    private String name;
    public static Long MAX_NUMBER_OF_PEOPLE = Long.valueOf(750000);



    public City(int population, String name) {
        this.population = population;
        this.name = name;

    }

    public City() {
        this.population = 510000;
        this.name = "Гомель";
        
    }

    public void printOnDisplay() {
        System.out.println("Информация: ");
        System.out.println("Мой город " + name + ", в нем проживает - " + population + " человек.");
        System.out.println("Максимальновозможное количество - " + MAX_NUMBER_OF_PEOPLE +" жителей.");
    }


}