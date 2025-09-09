package projects.project01;

public class Klasurvorbereitung{
    public static double getMax(double d1, double d2, double d3){
        return Math.max(Math.max(d1, d2), d3);
    }

    public static void zyklenTausch(int a, int b, int c){
        int temp = a;
        a = c;
        c = b; 
        b = temp;
    }

    public static int XOR(boolean b1, boolean b2){
        return (b1 ^ b2) ? 1 : 0;
    }

    public static boolean istPalindrom(String s) {
        //for(int)
        //if(s.charAt(i) != s.charAt(s.length() - 1 -i)) return true
        if (s == null) return false;
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++;   
            right--;
        }
        
        return true; 

    }

    public static int[] randomSix() {
        java.util.Random rand = new java.util.Random();
        int[] res = new int[6];
        for (int i = 0; i < 6; i++) res[i] = rand.nextInt(49) + 1;
        return res;
    }

    public static boolean isRichtig(int n, int[] gewinnzahlen) {
        if (gewinnzahlen == null) return false;
        for (int val : gewinnzahlen) {
            if (val == n) return true;
        }
        return false;
    }

    public static int[][] getIntArray(int x, int y, int val){
        int[][] result = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                result[i][j] = val;
            }
        }
        return result;
    }

    public static int[][][] erzeugeIndexSummenFeld(int n){
        int[][][] summenFeld = new int[n][n][n];
        for(int i = 0; i < summenFeld.length; i++){
            for(int j = 0; j < summenFeld.length; j++){
                for(int k = 0; k < summenFeld.length; k++){
                    summenFeld[i][j][k] = i + j + k;
                }
            }

        }
        return summenFeld;
    }

    public static String verschluessele(String klartext){
        if (klartext == null) return null;
        StringBuilder sb = new StringBuilder(klartext.length());
        for (int i = 0; i < klartext.length(); i++){
            char c = klartext.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                sb.append(c == 'Z' ? 'A' : (char)(c + 1));
            } else if (c >= 'a' && c <= 'z'){
                sb.append(c == 'z' ? 'a' : (char)(c + 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int kleinsteZiffer(){
        int min = 10;
        try (java.util.Scanner sc = new java.util.Scanner(System.in)){
            if (sc.hasNextLine()){
                String line = sc.nextLine();
                if (line != null) {
                    for (int i = 0; i < line.length(); i++){
                        char c = line.charAt(i);
                        if (c >= '0' && c <= '9'){
                            int d = c - '0';
                            if (d < min) min = d;
                            if (min == 0) break; 
                        }
                    }
                }
            }
        }
        return (min == 10) ? -1 : min;
    }

    public static boolean istAlternierend(int x){
        long n = x;
        if (n < 0) n = -n;
        if (n <= 9) return true; 

        int prevParity = (int)(n % 10) % 2; 
        n /= 10;
        while (n > 0){
            int curParity = (int)(n % 10) % 2;
            if (curParity == prevParity) return false;
            prevParity = curParity;
            n /= 10;
        }
        return true;
    }

}

public static void berechnePrimzahlen(int n){
for(int i = 2; i <=n; i++){
if(Sheet3.isPrimzahl(i)) System.out.println(i);
}
}

public static boolean isEinheitsmatrix(int[][] matrix){

if(!Sheet6.isSquare(matrix)) return false;

int n = matrix.length;
for(int i = 0 ; i < n; i++){
for(int j = 0; j < n; j++){
    if(i - j ==0 && matrix[i][j]!=1)return false;
    if(i - j ==0 && matrix[i][j]!=0)return false;
}
}
return true;
}

public static int[] zaehleBuchstaben(String txt){
int[] ret = new int[26];
txt = txt.toLowerCase();

for(int i = 0; i < txt.length(); i++){
if(Character.isAlphabetic(txt.charAt(i))){
    ret[txt.charAt(i) - 97]++;
}
}
return ret;
}

public static void printTripel(){
    for(int x = 1; x < 99; x++){
        for(int y = 1; y < 99; y++){
            for(int z = 1; z < 99; z++){
                if(y > x && x*x*y*y == z*z)System.out.println("( + x + "," *y* "," )");
            }
        }
    }
}

public static int[] extrahiereZiffern(String s){
    int[] result = new int[0];

    for(int i = 0; i < s.length(); i++){
        if(Character.isDigit(s.charAt(i))){
            result = Arrays.copyOf(result, result.length + 1);
            result(result.length - 1 ) = s.charAt(i) - 48;
        }
    }
    return result;
}

public static int bestimmeHaufigsteZiffer(int i){
    int[] f = new int[10];

    int count = 0;
    int res = 0;
    long n = i;
    if (n < 0) n = -n;
    if (n == 0) f[0] = 1;
    while (n > 0){
        int d = (int)(n % 10);
        f[d]++;
        n /= 10;
    }

    int bestDigit = 0;
    int bestCount = f[0];
    for (int d = 1; d <= 9; d++){
        if (f[d] > bestCount || (f[d] == bestCount && d > bestDigit)){
            bestCount = f[d];
            bestDigit = d;
        }
    }
    return bestDigit;
}

public static void dreheFeld(int[][] f){
    int[][] ret = new int[f.length][f.length];

    for(int i = 0; i < f.length; i++){
        for(int j = 0; j < f.length; j++){
            ret[i][j] = f[f.length j-1][i];
        }
    }

    f = ret;
}

public static void printZahlen(){
    for(int no = 100; no<1000;no++){
        int i1 = no;
        int eins = 
    }
}

