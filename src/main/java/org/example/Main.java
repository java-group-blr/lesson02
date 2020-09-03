package org.example;

public class Main {
    public static void main(String[] args) {
        City castCity = new City() ;
        City javaCity = new City(5 , "JavaMr.Neelixs" ) ;    // Вызов класса


        System.out.println("--------------------------------------");    // Вывод информации
        javaCity.printInfo();                                        // Вызов метода из класса City
        System.out.println("--------------------------------------");
        castCity.printInfo();
        System.out.println("--------------------------------------");

    }
}
