package Kodunetoo;

public class Main2 {
    public static void main(String[] args) {
        White white = new White("Germany", "white", "Riesling");
        white.bestWine();

        White white2 = new White("France", "white", "Sauvignon Blanc");
        white2.bestWine();
        white2.description();
        System.out.println("-----------");

        Red red = new Red("Germany", "red","Pinot Noir");
        red.bestWine();

        Red red2 = new Red("France", "red", "Syrah");
        red2.bestWine();
        red2.description();
        System.out.println("-----------");

    }
    
}
