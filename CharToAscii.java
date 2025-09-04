package blockkurs; 
import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie ein Zeichen ein: ");
        String input = scanner.nextLine();

        if (input.length() > 0) {
            char character = input.charAt(0);
            int asciiCode = (int) character;

            System.out.println("Das Zeichen '" + character + "' hat den ASCII/Unicode-Code: " + asciiCode);
        } else {
            System.out.println("Kein Zeichen eingegeben!");
        }
        scanner.close();
    }
}