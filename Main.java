package com.company;

public class Main {
public static void main(String[] args) {

    City myCity = new City();
    City present = new City("Gomel",200000);

    myCity.printInfo();
    System.out.println("------------------------------------");
    present.printInfo();
}
}
