package org.example;

public class City {
    private int population ;    // приватное целочисленное поле
    private String name ;       // приватное строковое поле
    public static final long MAX_NUMBER_OF_PEOPLE = 2000000;    // публичное константное статическое длинночисленное (Long) поле

    // Конструкторы класса
    public City (int population, String name) {
        this.population = population ;
        this.name = name ;
    }

    public City () {
        this.population = 30 ;
        this.name = "JavaBlrGroups" ;
    }

    public void printInfoCity () {   // Вывод информации
        System.out.println("City information");
        System.out.println("The city is called: " + name);
        System.out.println("Lives in the city: " + population);
        System.out.println("Maximum inhabitants in a city: " + MAX_NUMBER_OF_PEOPLE);

    }
}
// by Mr.Neelixs