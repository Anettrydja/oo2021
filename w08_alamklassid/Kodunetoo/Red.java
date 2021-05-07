package Kodunetoo;

public class Red extends Wine {
    public Red(String country, String type, String name){
        super(country, type, name);
    }

    @Override
    public void bestWine(){
        System.out.println("My favourite " + this.country + " " + this.type + " wine is " + this.name);
    }

    @Override
    public void description(){
        System.out.println("Usually " + this.type + " wine is more drier than others");
    }
    
}
