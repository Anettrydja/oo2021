public abstract class Kolmkolad{
    public int pohitoon;
    public int terts;
    public int kvint;

    public Kolmkolad(int pohitoon, int terts, int kvint){
        this.pohitoon = 60;
        this.terts = pohitoon + 4;
        this.kvint = pohitoon + 7;
    }

    public void mathTerts(){
        System.out.println("Terts on: " + this.terts);
    }

}