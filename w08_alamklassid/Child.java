public class Child extends Parent{

    public Child(String name, String dream) {
        super(name, dream);
    }

    public int addThree(int a, int b, int c){
        return super.addAB(a, b) + c;
    }
    
    @Override
    public void firstThingIDo(){
        super.firstThingIDo();
        System.out.println("I get up to mischief");
    }

    @Override
    public void howISpendMyEvenings() {
        System.out.println("I run around");
    }

    @Override
    public void timeIGoToSleep() {
        super.timeIGoToSleep();
        System.out.println("23:50");
    }
}
