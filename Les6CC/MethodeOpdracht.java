import java.lang.Math;

public class MethodeOpdracht {
    public static void main (String[] args) {
        int base = 5;
        int exp = 3;
        int number = 4;
        System.out.println(exponent(base, exp));
        System.out.println(isOdd(number));
    }
    
    public static int exponent(int base, int exp) {
        return ((int)Math.pow(base, exp));
    }
    
    public static boolean isOdd (int number) {
        if (number % 2 == 0) {
            return (false);
        } else {
            return (true);
        }
        
    }
}