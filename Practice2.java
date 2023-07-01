/* Guessing Game:
 * Create a Java program that generates a random number between 1 and 100. 
 * The user should be prompted to guess the number. Provide feedback to 
 * the user if their guess is too high or too low. 
 * Continue the game until the user guesses the correct number.
 */
package practice2;
import java.util.Scanner;
import java.util.Random;

public class Practice2 {

   
    public static void main(String[] args) {
       Random random = new Random(); 
       Scanner input = new Scanner (System.in);
       String ready;
       
       int RandomNumber = random.nextInt(100) + 1;
     
       System.out.println("WELCOME TO THE GUESSING GAME!");
       
       System.out.println("INSTRUCTIONS");
       System.out.println("This game will generate a random number from 1 to 100.\nYour objective is to guess the number!");
       
       System.out.print("Are you ready to play? (yes/no): ");
       ready = input.nextLine();
       
       if (ready.equalsIgnoreCase("yes")){
           
            int guess; 
            
            int attempts = 0;
           do {
                System.out.print("Enter your guess (between 1 and 100): ");
                guess = input.nextInt();
                attempts++;

                if (guess < RandomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > RandomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    System.out.println("Number of attempts: " + attempts);
                }
            } while (guess != RandomNumber);
        } else {
            System.out.println("Okay, maybe next time!");
        }

       
    }
}
     