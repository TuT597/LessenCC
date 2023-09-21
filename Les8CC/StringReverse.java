import java.lang.StringBuilder;

public class StringReverse {
    public static void main (String[] args) {

        StringBuilder str = new StringBuilder("Abcdef");

        System.out.println("Original = "+ str.toString());
 
        StringBuilder reverseStr = str.reverse();
 
        System.out.println("Reverse = "+ reverseStr.toString());
        
        if (str.equals(reverseStr)) System.out.println("String is a palindrome");
    }
}