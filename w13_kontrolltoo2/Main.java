

public class Main {
    public static void main(String[] args) {
        CKolmkola cKolmkola = new CKolmkola(60, 64, 67);
        cKolmkola.mathPohitoon();
        cKolmkola.mathTerts();
        cKolmkola.mathKvint();

        FKolmkola fKolmkola = new FKolmkola(65, 69, 72);
        fKolmkola.mathPohitoon();
        fKolmkola.mathTerts();
        fKolmkola.mathKvint();

        GKolmkola gKolmkola = new GKolmkola(67, 71, 74);
        gKolmkola.mathPohitoon();
        gKolmkola.mathTerts();
        gKolmkola.mathKvint();



        
    }
}

