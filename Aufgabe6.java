package projects.project01;

public class Aufgabe6{
    public static boolean istRechteckig(int[][] a){
        for(int i = 0; i < a.length - 1; i++){
            if(a[i].length != a[i+1].length) return false;
        }
        return true;    
    }


public static double [][] getDoubleArray(int x, int y){
    double [][] result = new double[x][y];
    for(int i = 0; i < x; i++){
        for(int j = 0; j < y; j++){
            result[i][j] = Integer.parseInt(" "+(Math.random()*10));
        }
    }
    return result;
}

public static double getMinimum(double[] a){
    double min = a[0];
    for(double d : a){
        if(d < min) min = d;
    }
    return min;
}

public static int getMinimumIndex(double[] a){
    double min = a[0];
    int index = 0;
    for(int i = 0; i < a.length; i++){
        if(a[i] < min){
            min = a[i];
            index = i;
        }
    }
    return index;
}

public static boolean isSquare(int[][] test){
    for(int i = 0; i < test.length; i++){
        if(test[i].length != test.length);
    }
    return false;
}

public static String getNameOfMonth(int no){
    String[] months = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
    if(no < 1 || no > 12) return "Ungültige Monatsnummer";
    return months[no - 1];
}

public static int[] concat(int[] x1, int[] x2){
    int[] x = new int{x1.length + x2.length};
    System.arraycopy{x1, srcPos:0, x.destPos:0, x.length};
    System.arraycopy{x2, srcPos:0, x,x.length, x2.length};
    
}

public static double [][] getIndexSumArray(int a, int b){
    double [][] result = new double[a][b];
    for(int i = 0; i < a; i++){
        for(int j; j < b; j++){
            result[i][j] = i + j;
        }
    }
    return result;
}

public static boolean pruefeZeilensummen(int [][] a){
      int sum = 0;
      for(int i = 0; i < a.length; i++){
        int rowSum = 0;
        for(int j = 0; j < a.length; j++){
           rowSum = a[i][j];
           }
           if(rowSum == sum){
         return true;
           } else {
            return false;
           }
            
        }

      }

    public static int ersteDoppelteZahl(int[] a){
                public int indexOf(int[] a){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a.length; j++){
                    if(a[i] == a[j]){
                        return i;
                    }
                    else {
                        return -1;
                         }
                   }
               }
           }
        }


    public static int[] getParameters(String s) {
        String[] parts = s.split(",");
        int[] zahlen = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            zahlen[i] = Integer.parseInt(parts[i].trim());
        }
        return zahlen;
    }


    public static String normiereLeerzeichen(String s) {
        if(s.contains(" " + " ")){
            return Leerzeichenentf(s);
        } else{
            return s;
        }
    }
    public static String Leerzeichenentf(String s){
        String[] parts = s.split(" " + " "); 
        String e = String.join("", parts);
        if(s.contains(" " + " ")){
            return Leerzeichenentf(e);
        }else{
            return e;
        }
    }
        //String[] parts = s.split(" +");
        //return String.join(" ", parts);
    }


