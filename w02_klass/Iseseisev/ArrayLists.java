package Iseseisev;
import java.util.*;

import java.util.*;

// Andmekogum. Kui massiivis peab loomisel teadma, kui suur ta on, siis sellel listil pole seda tarvis- loend suureneb ise vastavalt vajadusele
public class ArrayLists {
    public static void main(String args[]){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Karl");
        myList.add("Johanna");
        myList.add("Jaanus");
        myList.add("Sirli");
        myList.add("Helina");
        myList.add("Margus");
        Collections.sort(myList);
        System.out.println("Nimed tähestiku järjekorras oleksid: ");
        for(String i : myList){
            System.out.println(i);
        }
    }
}
