import java.util.Scanner;
import java.io.*;

// Harmooniline keskmine
// Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu läbimise kiirused (km/h), väljundiks nende kahe kilomeetri läbimise keskmine kiirus.

public class Punkt1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta esimene kiirus km/h: ");
        double a = scanner.nextDouble();
        System.out.println("Sisesta teine kiirus km/h: ");
        double b = scanner.nextDouble();
        double d = ((a+b)/2);
        System.out.println("Nende kahe keskmine kiirus on: " + d + " km/h");

    }
}


