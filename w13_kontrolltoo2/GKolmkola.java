public class GKolmkola extends Kolmkolad{
    public GKolmkola(int pohitoon, int terts, int kvint){
        super(pohitoon, terts, kvint);
    }

    @Override
    public void mathPohitoon(){
        System.out.println("G põhitoon on: "+ this.pohitoon);
    }

    @Override
    public void mathTerts(){
        System.out.println("G terts on: " + this.terts);
    }

    @Override
    public void mathKvint(){
        System.out.println("G kvint on: "+this.kvint);
    }
    
}
