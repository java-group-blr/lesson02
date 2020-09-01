public class City {
    private int population;
    private String name;
    public static final Long max_number_of_people=Long.valueOf(5000000);

    public City(int myPopulation, String myName) {
        this.population=myPopulation;
        this.name=myName;
    }

    public City(){
        this.population=400000;
        this.name="Brest";
    }

    public void printInfo(){
        System.out.println("City information");
        System.out.println("City name: "+name);
        System.out.println("City population: "+population);
        System.out.println("Maximum number of people in the city: "+max_number_of_people);
    }
}

