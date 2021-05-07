package Kodunetoo;

public class White extends Wine {
    public White(String country, String type, String name){
        super(country, type, name);
    }

    @Override
    public void bestWine(){
        System.out.println("My favourite " + this.country + " " + this.type + " wine is " + this.name);
    }

    @Override
    public void description(){
        System.out.println("Usually " + this.type + " wine provide more of a sweetness than red wines");
    }
}