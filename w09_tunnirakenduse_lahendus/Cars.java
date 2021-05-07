import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cars {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

        Files.readAllLines(Paths.get("information.txt"))
        .stream()
        .map(e -> e.split(","))
        .filter(e -> e[1].equals("France"))
        .map(e -> e[0])
        .forEach(pw::println);
        pw.close();
        System.out.println("Ava fail output.txt");
    }



}
