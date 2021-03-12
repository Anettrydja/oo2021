package Kodunetoo;

public class CarsInfo {
    public static void main(String[] args){

        Cars car1 = new Cars("Maserati", CarType.COUPE);
        Cars car2 = new Cars("VolksWagen", CarType.TOURING);
        Cars car3 = new Cars("BMW", CarType.CABRIOLET);

        car1.carYear(2010);
        car1.carCountry("Italy");
        car1.carModel("Ghibli");
        car1.printCars();

        car2.carYear(2015);
        car2.carCountry("Germany");
        car2.carModel("Passat");
        car2.printCars();

        car3.carYear(2015);
        car3.carCountry("Germany");
        car3.carModel("viiene");
        car3.printCars();
    }
}

    
