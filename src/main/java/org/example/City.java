package org.example;

    public City () {
        this.population = 400000L;
        this.name = "Слуцк";
    }

    public City (int population, String name) {
        this.population = population;
        this.name = name;
    }

    public class City {
        private int population;
        private String name;
        public static final Long MAX_NUMBER_OF_PEOPLE = 2000000L;

        public void printInfo () {
            System.out.println("В городе " + this.name + "жыве " + this.population + "невероятных чнловек");
        }
    }


