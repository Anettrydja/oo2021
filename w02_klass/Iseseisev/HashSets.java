package Iseseisev;
import java.util.HashSet;

// kogum elementidest mille ükski liige ei kordu.
// ei hoia meeles sinna paigutatud elementide järjekorda
// on võimalik hoida ka 0 elementi
public class HashSets {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Volkswagen");
        cars.add("Jaguar");
        System.out.println(cars.contains("Jaguar"));
        // Hash set can contain null value whereas array list cannot
    }
}
