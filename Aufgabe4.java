package projects.project01;

public class Aufgabe4 {
    public static void main(String[] args){
        int x = 7;
        int i = 0;
        while(i<x){
            System.out.println(i);
            i++;
        }
    }

    public static int qdq(String z){
        Integer.parseInt(z);
        int sum = 0;
        for(char c : z.toCharArray()){
            sum += c - '0';
        }
        return sum*sum;
    }

    public static boolean hasDoubleChars(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                return true;
            }
        }
        return false;
    }
    public static char haeufigstesZeichen(String s){
        for(char c : s.toCharArray()){
            int count = 0;
            for(char d : s.toCharArray()){
                if (c == d){
                    count++;
                }
                System.out.println(c + ": " + count);
            }
        }
        return ' ';
    }

    public static String komplettiere(String s){
        StringBuilder result = new StringBuilder(s);
        for(char digit = '0'; digit <= '9'; digit++){
            if(s.indexOf(digit) == -1){
                result.append(digit);
            }
        }
        return result.toString();
    }


public static String loesche(String s){
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < s.length()) {
        char c = s.charAt(i);
        if (Character.isDigit(c)) {
            int toDelete = c - '0';
            i += toDelete;
        } else {
            result.append(c);
            i++;
        }
    }
    return result.toString();
}

public static String dekomprimiere(String s){
    String res = "";
    for(int i = 0; i < s.length(); i = i*2){
        int no = s.charAt(i);
        char c = s.charAt(i + 1);

        for(int j = 0; j < no; j++){
            res = res + c;

        }
    }
    return res;
}

public static int hoechsteZiffer(String s){
    int max = 0;
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(Character.isDigit(c) && c - '0' > max){
            max = c - '0';
        }
    }
    return max;
}

public static int hoechstePosition(String s){
    return s.indexOf(String.valueOf(hoechsteZiffer(s)));
}

public static void printTeilerZahlem(int start, int end, int n){
    for(int i = start; i <= end; i++){
        int no = 0;
        for(int j = 1; j <= i; j++){
            if(i % j == 0){
                no++;
            }
        }
        if(no == n){
            System.out.println(i);
        }
    }
}

public static void ermittleAufgabe(int z){
    for(int b = 1; b <= 10; b++){
        for(int a = 1; a <= 10; a++){
            if(a >= b){if(Math.abs(a*b - z) <=5){
                System.out.println(a + " * " + b + " = " + (a*b));
            }
            
            }
        } 
    }
}
   

public static void printZahlendreieck(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(i);
        }
        if(i!= n)System.out.println();
    }
  }
}