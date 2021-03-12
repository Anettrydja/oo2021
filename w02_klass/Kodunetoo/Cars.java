package Kodunetoo;

public class Cars { 
    public int wheels = 4;
    String name;
    int year;
    String country;
    String model;

    public Cars(String name, CarType coupe){
        this.name = name;
    }
    public void carYear(int carYear){
        year = carYear;
    }
    public void carCountry(String carCountry){
        country = carCountry;
    }
    public void carModel(String carModel){
        model = carModel;
    }
    public void printCars(){
        System.out.println("Name of the car: " + name );
        System.out.println("Production year: " + year);
        System.out.println("Origin country: " + country);
        System.out.println("Model: " + model);
        System.out.println("And this car has: " + wheels + " wheels");
        System.out.println( );
    }
}