import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class NumberTry {
    public static void main(Integer[] args) throws IOException{
        File file = new File("Number.txt");
        File filewrite = new File("out_numbers.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        Integer line = br.readLine();
        while (line != null){
            Integer[] lineData = line.split(",");
            System.out.println(lineData[0] + " | " + lineData [lineData.length-1]);
            line = br.readLine();
        }

        fr.close();
        br.close();

        if (!fileWrite.exists()){
            fileWrite.createNewFile();
        }

        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            Integer line2 = scanner.nextLine();
            Integer[] lineData = line2.split(",");
            Integer all = lineData[0]+lineData[1];
            pw.println(all);
          }
      
          scanner.close();
          pw.close();
      
    }
}
