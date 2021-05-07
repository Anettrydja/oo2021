import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Another {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Example.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();

        try{
            fh = new FileHandler("outLog.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (exception e){
            System.out.println("Something went wrong");
        }

        try {
            int ecuation = 5 / 0;
        } catch (ArithmeticException e){
            logger.warning(e.getMessage());
        }

        try {
            getArrayElement(3);
        } catch (Exception e){
            logger.severe(e.getMessage);
        }

        System.out.println("Siin on lõpp");
    }

    public static int getArrayElement(int posi){
        int[] intArray = new int[]{1, 2, 3};
        return intArray[posi];
    }
}
