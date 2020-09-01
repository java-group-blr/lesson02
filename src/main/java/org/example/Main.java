package com.company;

public class Main {
    public static void main (String[] args) {
        City myCity = new City();
        City infoCity = new City(15000, "Grez" );

        myCity.printInfo();
        System.out.println("----------------------------------");
        infoCity.printInfo();
    }
}
