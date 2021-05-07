public class FKolmkola extends Kolmkolad{
    public FKolmkola(int pohitoon, int terts, int kvint){
        super(pohitoon, terts, kvint);
    }

    @Override
    public void mathPohitoon(){
        System.out.println("F põhitoon on: "+ this.pohitoon);
    }

    @Override
    public void mathTerts(){
        System.out.println("F terts on: " + this.terts);
    }

    @Override
    public void mathKvint(){
        System.out.println("F kvint on: " +this.kvint);
    }
    
}
