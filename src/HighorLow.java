import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number between 1 and 10
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        // Prompt the user to guess the number
        System.out.print("Guess a number between 1 and 10: ");
        int userGuess = scanner.nextInt();

        // Compare the user's guess with the random number
        if (userGuess < randomNumber) {
            System.out.println("Too low! The correct number was " + randomNumber);
        } else if (userGuess > randomNumber) {
            System.out.println("Too high! The correct number was " + randomNumber);
        } else {
            System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}

