public class GKolmkola extends Kolmkolad{
    public GKolmkola(int pohitoon, int terts, int kvint){
        super(pohitoon, terts, kvint);
    }

    @Override
    public void mathPohitoon(){
        this.pohitoon = this.pohitoon + 7;
        System.out.println("G põhitoon on: "+ this.pohitoon);
    }

    @Override
    public void mathTerts(){
        this.terts = this.pohitoon + 3;
        System.out.println("G terts on: " + this.terts);
    }

    @Override
    public void mathKvint(){
        this.kvint = this.kvint + 7;
        System.out.println("G kvint on: "+this.kvint);
    }
    
}
