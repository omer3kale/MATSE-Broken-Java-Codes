package blockkurs; 

public class One{
    public static String addOne(String s){
        int number = Integer.parseInt(s);
        number = number + 1;
        return Integer.toString(number);
    }
}