import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

//Kilomeetriste lõikude läbimiste keskmised kiirused loetakse sisse veebiaadressilt, kogu teekonna läbimise keskmine kiirus salvestatakse faili.

public class Punkt3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(
        new URL("http://www.tlu.ee/~ray/lengths.txt").openStream()));
    
    PrintWriter pw = new PrintWriter(new FileWriter("Vastus.txt"));

    String line = br.readLine();
    String[] lineData = line.split(" ");

    pw.println("Keskmine kiirus on: " + average(lineData) + " km/h");
    System.out.println("Keskmine kiirus on kirjas failis Vastus.txt");
    br.close();
    pw.close();
  }

  public static int sum(String[] input){
    int sum = 0;
    for (String data : input){
      sum += Integer.parseInt(data);
    }
    return sum;
  }
  public static double average(String[] input){
    return sum(input) / input.length;
  }
}