import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a measurement in meters
        System.out.print("Enter a measurement in meters: ");
        double meters = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Convert meters to miles, feet, and inches
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        // Display the converted measurements
        System.out.println(meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
}
