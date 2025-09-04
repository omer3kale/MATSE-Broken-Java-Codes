package blockkurs;
import java.util.Scanner; 

public class getDistance {
    public static double calculateDistance(double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie 4 nachkommazahlen ein: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = calculateDistance(x1, x2, y1, y2);
        System.out.println("Die Entfernung beträgt: " + distance);
        scanner.close();
    }
}

