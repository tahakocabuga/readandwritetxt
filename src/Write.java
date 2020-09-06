import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Write {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("text.txt");
            PrintWriter pw = new PrintWriter(fw);

            String userText = input.next();

            pw.println(userText);

            pw.close();

        }

        catch (IOException e) {
            System.out.println("Error !! ");
        }

    }
}
