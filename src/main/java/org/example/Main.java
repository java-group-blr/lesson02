package org.example;

public class Main {
    public static void main (String[] args) {
        City homel = new City (43000, "Homel");
        City grez = new City(15000, "Grez");
        City mogilev = new City();

        homel.printInfo();
        System.out.println("----------------------------------");
        grez.printInfo();
    }
}
