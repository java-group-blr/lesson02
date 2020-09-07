package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        City newCity1 = new City();
        City newCity2 = new City(10000, "Moscow");
        newCity1.printInfo();
        newCity2.printInfo();
    }
}
