public abstract class Kolmkolad{
    public int pohitoon;
    public int terts;
    public int kvint;

    public Kolmkolad(int pohitoon, int terts, int kvint){
        this.pohitoon = pohitoon;
        this.terts = terts;
        this.kvint = kvint;
    }

    public void mathPohitoon(){
        System.out.println("Põhitoon on: " + this.pohitoon);
    }

    public void mathTerts(){
        System.out.println("Terts on: " + this.terts);
    }

    public void mathKvint(){
        System.out.println("Kvint on: " + this.kvint);
    }

}