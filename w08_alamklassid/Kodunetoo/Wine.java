package Kodunetoo;

public abstract class Wine {
    public String country;
    public String type;
    public String name;

    public Wine(String country, String type, String name){
        this.country = country;
        this.type = type;
        this.name = name;
    }

    public void bestWine(){
        System.out.println("My favourite " + this.country + " " + this.type + " wine is Chablis");
    }

    public abstract void description();
    
}
