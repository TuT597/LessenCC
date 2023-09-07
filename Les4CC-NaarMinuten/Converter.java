import java.util.Scanner;
import java.math.BigInteger;
import java.text.DecimalFormat;  

public class Converter {
    
    private static final DecimalFormat format = new DecimalFormat("0.00");  
    
    public static void main (String[] args) {
        
    //minute converter
    BigInteger years = BigInteger.valueOf(500000000);  
    
    BigInteger minutes = years.multiply(BigInteger.valueOf(525960));
    
    System.out.println(minutes);
    
    
    //Temp converter
    float celsius = 34.80f;
    float fahrenheit = 98.30f;
    
    float newFahrenheit = (celsius * 9 / 5) + 32;
    float newCelsius = (fahrenheit - 32) * 5 / 9;
    
    System.out.println(format.format(newCelsius) + "\n" + format.format(newFahrenheit));
    
    
    //Speed converter
    double meters = 2500;
    double hours = 5;
    double minutes2 = 56;
    double seconds = 23;
    
    double hoursFormula = (hours + (minutes2 / 60) + (seconds / 3600));
    
    double mps = meters / ((hours * 3600) + (minutes2 * 60) + seconds);
    double kmh = (meters / 1000) / hoursFormula;
    double mph = (meters / 1609) / hoursFormula;
    
    System.out.println("Meters per second: " + mps + "\nKmh: " + kmh + "\nMph: " + mph);

       
    }
}