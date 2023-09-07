import java.util.Scanner;
import java.math.BigInteger;

public class Converter {
    public static void main (String[] args) {

    BigInteger years = BigInteger.valueOf(500000000);  
    
    BigInteger minutes = years.multiply(BigInteger.valueOf(525960));
    
    System.out.println(minutes);
    

       
    }
}