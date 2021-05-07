public class FKolmkola extends Kolmkolad{
    public FKolmkola(int pohitoon, int terts, int kvint){
        super(pohitoon, terts, kvint);
    }

    @Override
    public void mathPohitoon(){
        this.pohitoon = this.pohitoon + 5;
        System.out.println("F põhitoon on: "+ this.pohitoon);
    }

    @Override
    public void mathTerts(){
        this.terts = this.pohitoon + 4;
        System.out.println("F terts on: " + this.terts);
    }

    @Override
    public void mathKvint(){
        this.kvint = this.pohitoon + 7;
        System.out.println("F kvint on: " +this.kvint);
    }
    
}
