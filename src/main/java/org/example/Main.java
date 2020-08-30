package org.example;

public class Main {
    public static void main(String[] args) {
        City bobruisk = new City(220000, "Bobruisk");
        City minsk = new City(2000000, "Minsk");

        bobruisk.printInfo();
        System.out.println("----------------------------------");
        minsk.printInfo();
    }
}
