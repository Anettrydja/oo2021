public abstract class Parent{
    public String name;
    public String dream;
    public int ab;

    public Parent(String name, String dream){
        this.name = name;
        this.dream = dream;
    }

    public void timeIGoToSleep(){
        System.out.println("22:50");
    }

    public void favouriteHobbyIs(String hobby){
        System.out.println(this.name + " lemmik hobi on" + hobby);
    }

    public int addAB(int a, int b){
        ab = a + b;
        return ab;
    }

    public void firstThingIDo(){
        System.out.println("I brush my teeth");
    }

    public abstract void howISpendMyEvenings();
}