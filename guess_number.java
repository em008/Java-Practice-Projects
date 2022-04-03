// Needed for the Scanner class to read input
import java.util.Scanner;

// Used to generate random number 
import java.util.Random;

public class guess_number {

    public static void main(String[] args) {
        // Create scanner variable using Scanner class
        Scanner keyboard = new Scanner(System.in);

        // Create instance of Random class
        Random rand = new Random();
        int rand_int = rand.nextInt(20) + 1;

        // Introduction and prompt user to input choice
        System.out.println("Hello! What is your name?");
       
        // User input
        String name = keyboard.nextLine();

        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20. Take a guess.");

        String guess = keyboard.nextLine();

        int counter = 0;

        do {
            if (Integer.parseInt(guess) > rand_int) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
                // main(args);
                // String anotherGuess = keyboard.nextLine();
            }
    
            if (Integer.parseInt(guess) < rand_int) {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
                // main(args);
                // String anotherGuess = keyboard.nextLine();
            }

            counter++;
          }
          while (Integer.parseInt(guess) != rand_int);

        // while (Integer.parseInt(guess) != rand_int) {
        //     if (Integer.parseInt(guess) > rand_int) {
        //         System.out.println("Your guess is too high.");
        //         System.out.println("Take a guess.");
        //         // main(args);
        //         // String anotherGuess = keyboard.nextLine();
        //     }
    
        //     if (Integer.parseInt(guess) < rand_int) {
        //         System.out.println("Your guess is too low.");
        //         System.out.println("Take a guess.");
        //         // main(args);
        //         // String anotherGuess = keyboard.nextLine();
        //     }

        //     counter++;
        //     continue;
        //   }

          System.out.println("Good job, " + name + "!" + " You guessed my number in " + (1 + counter) + " guesses!");
          System.out.println("Would you like to play again? (y or n)");

          String response = keyboard.nextLine();

          if (response == "y") {
              main(args);
          }
          else {
            System.exit(0);
          }

        // Close Scanner class
        keyboard.close();

    }
    
}
