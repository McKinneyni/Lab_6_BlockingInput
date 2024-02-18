
import java.util.Scanner;  // Import Scanner
public class CtoFConverter {  // Class declaration

    public static void main(String[] args) {  // Main

        Scanner in = new Scanner(System.in);  // Create Scanner object for user input
        double celsius;  // Declare variable to store  Celsius
        double fahrenheit;  // Declare variable to store Fahrenheit
        boolean done = false;  // Flag to control loop

        do {  // Start of do-while loop

            System.out.print("Enter temperature in Celsius: ");  // Prompt user for input
            if (in.hasNextDouble()) {  // Check if input is a valid double

                celsius = in.nextDouble();  // Read the temperature in Celsius
                fahrenheit = (celsius * 9 / 5) + 32;  // Convert Celsius to Fahrenheit
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);  // Display the result
                done = true;  // Set the flag to true to exit the loop

            } else {  // If input is not a valid double
                System.out.println("Invalid input! Please enter a valid temperature.");  // Display error message
                in.nextLine();  // Consume the invalid input to clear the buffer
            }

        } while (!done);  // Continue loop until valid input is provided
    }
}
