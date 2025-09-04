package blockkurs;
import java.util.Scanner;

public class Rahme{
    public static String rahmeEin(String s) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Wort ein: ");
        String input =  "*"  + scanner.nextLine()  + "*";
        scanner.close();
        return input;    
    }
}
