import java.util.Scanner;

public class Eindopdracht {
    
    static final private Scanner SCANNER = new Scanner(System.in);
    
    public static void main (String[] args) {
        System.out.println("Enter the amount of lucas numbers you want to print: ");
        lucasNumbers();
    }
    
    public static void lucasNumbers() {
        
        int amount = SCANNER.nextInt();
        int numberOne = 2;
        int numberTwo = 1;
        int numberThree;
        
        if (amount > 0 && amount < 45) {
            System.out.print(numberOne + " ");
            
            for (int i = 0; i < amount; i++) {
                System.out.print(numberTwo + " ");
                numberThree = numberOne + numberTwo;
                numberOne = numberTwo;
                numberTwo = numberThree;
            }
            
        } else {
            System.out.println("Error: integer overflow");
            lucasNumbers();
        }
    }
}