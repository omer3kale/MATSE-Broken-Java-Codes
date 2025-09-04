package blockkurs;
import java.util.Scanner;

public class ami{
    public static double getFahrenheit(double celcius){
        return (celcius * 9.0/5.0) + 32;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temp in celcius: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = getFahrenheit(celcius);
        System.out.println("Temp in fahrenheit: " + fahrenheit);
        scanner.close();
    }
}