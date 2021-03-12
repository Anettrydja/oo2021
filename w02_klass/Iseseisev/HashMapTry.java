package Iseseisev;
import java.util.HashMap;


// key ja valuede kaudu andmed

public class HashMapTry {
    public static void main(String[] args){
        HashMap<String, String> cCities = new HashMap<String, String>();
        // store string keys and string values
        cCities.put("Sweden", "Stockholm");
        cCities.put("Latvia", "Riga");
        cCities.put("Norway", "Oslo");
        cCities.put("Finland", "Helsinki");
        // et teada saada stringi value
        // System.out.println(cCities.get("Sweden"));
        // kui printida eraldi, keys =.keySet(), kui values =.values()
        for(String i : cCities.keySet()){
            System.out.println("key: " + i + " value: " + cCities.get(i));
            System.out.println("Country: " + i + " city: " + cCities.get(i));
        }
    }

    // public static void main(String[] args){
    //     HashMap<String, Integer> people = new HashMap<String, Integer>();

    //     people.put("Karl", 22);
    //     people.put("Jaanus", 30);
    //     people.put("Triinu", 27);
    //     people.put("Pets", 34);

    //     for (String i : people.keySet()){
    //         System.out.println("Nimi: " + i + ", Vanus: " + people.get(i));
    //     }
    // }
}
