public class Aufgabe3 {

    public static double getPostage(int order) {
        if (order <= 100) {
            return ((double) order) + 5.50;
        }
        if (order <= 200) {
            return ((double) order) + 2.00;
        }
        if (order > 300) {
            return (double) order;
        }
        return (double) order;
    }

    public static boolean hasEvenLength(String s) {
        int laenge = s.length();
        return (laenge & 1) == 0;
    }

    public static void count(int z){
        if(z < 0){
            for(int i = z; i <=0; i++){
                System.out.println(i);
            }
        }
        if(z > 0){
            for(int i = z; i >=0; i--){
                System.out.println(i);
            }
        }
    }

    public static int fakultaet(int z){
        int fakultaet = 1;
        for(int i = 1; i <= z; i++){
            fakultaet = fakultaet * i;
        }
        return fakultaet;
    }

    public static int getCharCount(String s, char c){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public static double doubleBirthday(int N){
        return 365.0 * Math.log(1/(1 - (N/365.0)));
    }

    public static String vereinfache(String s){
        String result = "";
        for(int i = 0; i < s.length(); i++){
            if(i == 0 || s.charAt(i) != s.charAt(i - 1)){
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static double getPi(int n) {
        double pi = 0.0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                pi += 1.0 / (2 * i + 1);
            } else {
                pi -= 1.0 / (2 * i + 1);
            }
        }
        return pi * 4;
    }

    public static boolean isHomogeneous(String s){
        if(s.length() == 0) return true;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(0)){
                return false;
            }
        } 
        return true;
    }

    public static boolean isPrimzahl(int z){
        if(z <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(z); i++){
            if(z % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
