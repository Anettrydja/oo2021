public class CKolmkola extends Kolmkolad{
    public CKolmkola(int pohitoon, int terts, int kvint){
        super(pohitoon, terts, kvint);
    }

    @Override
    public void mathPohitoon(){
        System.out.println("C põhitoon on: "+ this.pohitoon);
    }

    @Override
    public void mathTerts(){
        System.out.println("C terts on: " + this.terts);
    }

    @Override
    public void mathKvint(){
        System.out.println("C kvint on: " +this.kvint);
    }
    
}
