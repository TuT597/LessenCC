import java.util.Scanner;
import java.util.ArrayList;

public class Galgje {  
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> word = new ArrayList<>();
        ArrayList<Character> guess = new ArrayList<>();
        int turns = 10;
        String input = "";
        
        System.out.println("Player 1, enter a lowercase word that's less than 10 letters long: ");
        while (true) {
            input = scanner.nextLine();
            if (input.length() > turns) System.out.println("Word is too long!");
            else if (input.length() < turns) break;
        }
        
        for (char c : input.toCharArray()) {
            word.add(c);
            guess.add('_');
        }
        
        System.out.println(guess);
        
        while (true) {
            System.out.print("Player 2 guess a letter: ");
            char letter = scanner.next().charAt(0);
            
            if (word.contains(letter)) {
                System.out.println("\nYou guessed a letter!");
                int x = 0;
                for (char c : word) {
                    if (c == letter) {
                        guess.set(x, word.get(x));
                        x++;
                    } else {
                        x++;
                    }
                }
            } else {
                System.out.println("The word does not contain this letter!");
            }
            
            System.out.println(guess);
            turns--;
            
            if (guess.equals(word)){
                System.out.print("You have won, the word was: " + input);
                break;
            } else if (turns == 0) {
                System.out.println("You are out of turns and have lost the game!");
                break;
            }
                  
            System.out.println(turns + " turns left\n");
        } 
    }
}