package org.example;

public class Main {
    public static void main (String[] args){
        City myCity=new City();
        City infoCity = new City(2000000, "Minsk");

        myCity.printInfo();
        System.out.println("---------------------------------------------");
        infoCity.printInfo();
    }
}

