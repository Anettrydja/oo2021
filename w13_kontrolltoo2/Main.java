import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sisse = new Scanner(System.in);
        System.out.println("Sisesta arv: ");
        int pohitoon = sisse.nextInt();
        int terts = pohitoon + 4;
        int kvint = pohitoon + 7;

        CKolmkola cKolmkola = new CKolmkola(pohitoon, terts, kvint);
        cKolmkola.mathPohitoon();
        cKolmkola.mathTerts();
        cKolmkola.mathKvint();

        FKolmkola fKolmkola = new FKolmkola(pohitoon, terts, kvint);
        fKolmkola.mathPohitoon();
        fKolmkola.mathTerts();
        fKolmkola.mathKvint();

        GKolmkola gKolmkola = new GKolmkola(pohitoon, terts, kvint);
        gKolmkola.mathPohitoon();
        gKolmkola.mathTerts();
        gKolmkola.mathKvint();
        
    }
}

