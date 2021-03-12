package Iseseisev;
import java.util.ArrayList;

public class ArrayListsTry {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Jaguar");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Maserati");
        cars.add("Volvo");
        cars.set(3, "Opel");
        cars.remove(3);
        // cars.clear();
        System.out.println(cars);
        // ArrayList with a for loop. Size() method specifies how many times the loop should run
        // for (int i = 0; i < cars.size(); i++){
        //     System.out.println(cars.get(i));
        for (String i : cars){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(3);
        myNumbers.add(5);
        myNumbers.add(15);
        myNumbers.add(8);
        myNumbers.add(22);
        // Sama for on ka üleval stringidega
        for (int i : myNumbers){
            System.out.println(i);
        }
    }
}


