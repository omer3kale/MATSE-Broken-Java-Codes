package projects.project01;
import java.util.Random;
import java.util.Scanner;
import java.awt.Point;
import java.math.BigInteger;
import java.awt.Color;

public class Aufgabe5{
    public static int compare(Bruch b1, Bruch b2){
        double val1 = b1.getDoubleWert();
        double val2 = b2.getDoubleWert();
        if(val1 < val2){
            return -1; 
        } else if (val1 > val2){
            return 1;
        } else {
            return 0;
        }
    }

    public static void printRandom(int n){
        Random r = new Random();
        for(int i = 0; i < n; i++){
            System.out.println(r.nextInt(101));
        }
    }

    public static String getLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zeile ein: ");
        String line = sc.nextLine();
        sc.close();
        return line;
    }

    public static boolean isNearer(Point p1, Point p2, Point p3){
        double dist1 = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double dist2 = Math.sqrt(Math.pow(p1.x - p3.x, 2) + Math.pow(p1.y - p3.y, 2));
        return dist1 > dist2;
    }

    public static BigInteger fakultaet(int z){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <= z; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void printRGB(Color c){
        System.out.println("Rot: " + c.getRed());
        System.out.println("Grün: " + c.getGreen());
        System.out.println("Blau: " + c.getBlue());
        System.out.println("Magenta: " + (c.getRed() + c.getBlue()));
        System.out.println("Orange: " + (c.getRed() + c.getGreen()));
        System.out.println("Pink " + (c.getRed() + c.getGreen() + c.getBlue()/2));
    }

    public static void teste(Bruch b1, Bruch b2){
        System.out.println("Bruch 1: " + b1.zaehler + "/" + b1.nenner);
        System.out.println("Bruch 2: " + b2.zaehler + "/" + b2.nenner);
        int result = compare(b1, b2);
        if(b1 == b2){
            System.out.println("Älias");
        }else if(b1 != b2 && b1.equals(b2)){
            System.out.println("Klon");
        } else if(b1 != b2){
            System.out.println("verschieden");
        }
    }
}
