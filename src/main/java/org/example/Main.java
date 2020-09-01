package org.example;

public class Main {
    public static void main(String[] args) {
        //
        City myCity = new City();
        City present = new City(350000,"Grodno");


        myCity.printInfo();
        System.out.println("------------------------------------");
        present.printInfo();


    }
}