package blockkurs;
import java.util.Scanner;

public class Aufgabe2{
    public static double getInverse(int z){
        return 1.0 / z;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int testNumber = scanner.nextInt();
        double result = getInverse(testNumber);
        System.out.println("Number: " + result);
        scanner.close();
    }
}
