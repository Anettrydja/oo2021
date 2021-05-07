import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sisse = new Scanner(System.in);

        System.out.println("Sisesta täisarvuline põhitoon");
        int pohitoon = sisse.nextInt();

        int terts = pohitoon + 4;
        int kvint = pohitoon + 7;
        System.out.println("Täisarvuline põhitoon on : " + pohitoon + " terts " + terts + " kvint" + kvint);


        
    }
}

