import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        
        System.out.println("Enter the amount of items you want: ");
        int NUM_ITEMS = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Numbers to add seperated by spaces: ");
        String arrayInput = scanner.nextLine();
        String[] arrayStrings = arrayInput.split(" ");
        
        numbers = new int[NUM_ITEMS];
        
        int x = 0;
        for (String i : arrayStrings) {
            numbers[x] = Integer.parseInt(i);
            x++;
        }
        
        System.out.println("Results: ");
        System.out.println(Arrays.toString(numbers)); 
        
        for (int i : numbers) {
            System.out.print(i);
            for (int y = 0; y < i; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}