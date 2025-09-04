package blockkurs;
import java.util.Scanner;

public class firstLast{
    public static String firstAndLast(String s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein: ");
        String input =  scanner.nextLine();
        scanner.close();
        return "" + input.charAt(0) + input.charAt(input.length() - 1);
    }
}