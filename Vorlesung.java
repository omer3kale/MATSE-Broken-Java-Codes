package blockkurs;

public class Vorlesung {
    public static int xHochY(int x, int y) {
        int ergebnis = 1;
        for (int i = 0; i < y; i++) {
            ergebnis = ergebnis * x;
        }
        return ergebnis;
    }

    public static String get123(int z) {
        String ergebnis = "";
        for(int i=1; i <= z; i++){
            ergebnis=ergebnis + i;
        }
        return ergebnis;
    }
}