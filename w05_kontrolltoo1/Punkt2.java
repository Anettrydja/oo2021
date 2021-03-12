import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

//Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused kogumina (km/h). Väljasta kogu selle tee läbimise keskmine kiirus.

public class Punkt2 {
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new FileReader("keskmised.txt"));
        String line = br.readLine();
        double sum = 0;
        double lineCount = 0;
        double ans = 0;

        while (line != null){
            sum += Double.parseDouble(line);
            lineCount++;
            line = br.readLine();
            ans = (sum/lineCount);
        }
        System.out.println("Kokku nende keskmine kiirus on: " + df.format(ans) + " km/h");
        br.close();
    }
}