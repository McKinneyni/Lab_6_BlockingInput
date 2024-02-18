import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store user input and calculated values
        double gallonsOfGas = 0; // Initialize gallonsOfGas with a default value
        double fuelEfficiency = 0; // Initialize fuelEfficiency with a default value
        double pricePerGallon = 0; // Initialize pricePerGallon with a default value
        double costPer100Miles;
        double distanceWithGas;

        // Flag to control input validation loop
        boolean done = false;

        // Input validation loop number of gallons of gas
        do {
            System.out.print("Enter number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsOfGas = scanner.nextDouble();
                scanner.nextLine(); //  newline character
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a valid number of gallons.");
                scanner.nextLine(); // Consume invalid input
            }
        } while (!done);

        // Reset flag for next input validation
        done = false;

        // Input validation loop for fuel efficiency
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a valid fuel efficiency.");
                scanner.nextLine(); // Consume invalid input
            }
        } while (!done);

        // Reset flag for next input validation
        done = false;

        // Input validation loop for price of gas per gallon
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character
                done = true;
            } else {
                System.out.println("Invalid input! Please enter a valid price per gallon.");
                scanner.nextLine(); // Consume invalid input
            }
        } while (!done);

        // Calculate cost per 100 miles and distance the car can go with the gas in the tank
        costPer100Miles = (pricePerGallon / fuelEfficiency) * 100;
        distanceWithGas = gallonsOfGas * fuelEfficiency;

        // Display the calculated results
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distanceWithGas + " miles");

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
