package org.example;

public class Main {
    public static void main(String[] args) {
        City myCity = new City ();
        City myCity2 = new City(40000000, "Tokyo");

        myCity.printInfo();
        System.out.println("-------------------------------------");
        myCity2.printInfo();
    }
}
