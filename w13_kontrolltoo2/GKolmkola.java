public class GKolmkola extends Kolmkolad{
    public GKolmkola(int pohitoon, int terts, int kvint){
        super(pohitoon, terts, kvint);
    }

    @Override
    public void mathTerts(){
        this.terts = this.pohitoon + 4;
        System.out.println("Uus terts on" + this.terts);
    }
}
