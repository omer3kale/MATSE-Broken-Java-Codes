package blockkurs;

public class random{
    public static double getRandom(double min, double max){
        return  Math.random() * (max - min) + min;
    }
    public static int getIntRandom(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }
}