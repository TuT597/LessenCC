import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Queue albertHeijn = new Queue();
        Queue lidl = new Queue();
        Queue c1000 = new Queue();
        
        System.out.println("I add the numbers 5, 8, 2 and 9 to the list.");
        albertHeijn.add(5);
        albertHeijn.add(8);
        albertHeijn.add(2);
        albertHeijn.add(9);
        
        System.out.println("\nPrinting list");
        albertHeijn.print();
        System.out.println();
        
        albertHeijn.remove(3);
        
        System.out.println("testing remove() removing the 3rd index. Should be the 9");
        System.out.println("\nPrinting list");
        albertHeijn.print();
        System.out.println();
        
        System.out.println("testing peek()");
        System.out.println(albertHeijn.peek());
        
        System.out.println("testing isEmpty()");
        System.out.println(albertHeijn.isEmpty());
        
        System.out.println("testing size()");
        System.out.println(albertHeijn.size());
        
        System.out.println("testing out clear()");
        albertHeijn.clear();
        System.out.println("\nPrinting list");
        albertHeijn.print();
        System.out.println();
        
        System.out.println("I add the numbers 5, 8, 2 and 9 to the list.");
        albertHeijn.add(5);
        albertHeijn.add(8);
        albertHeijn.add(2);
        albertHeijn.add(9);
        
        System.out.println("testing out clear(int 1) should remove the 8");
        albertHeijn.clear(1);
        System.out.println("\nPrinting list");
        albertHeijn.print();
        System.out.println();
        
        System.out.println("testing out printReverse()");
        albertHeijn.printReverse();
        System.out.println();
        
        System.out.println("testing out jumpTheQueue(2, 1) should place the number 2 at the second spot");
        albertHeijn.jumpTheQueue(2, 1);
        System.out.println("\nPrinting list");
        albertHeijn.print();
        System.out.println();
        
        System.out.println("testing out toString()");
        System.out.println(albertHeijn.toString());
        System.out.println();
        
        System.out.println("testing out equals() should return true false");
        lidl = albertHeijn;
        System.out.println(albertHeijn.equals(lidl));
        System.out.println(albertHeijn.equals(c1000));
        
        System.out.println("\n testing out indexOf(2) method should return 1");
        System.out.println(albertHeijn.indexOf(2));
        
        System.out.println("\n testing out lastIndexOf(2) method should return 2");
        System.out.println(albertHeijn.lastIndexOf(2));
        
        System.out.println("\nEverything works yay!");
    }
}