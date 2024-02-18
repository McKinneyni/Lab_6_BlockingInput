
import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the sides of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Calculate the area, perimeter, and diagonal of the rectangle
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Display the calculated results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal of the rectangle: " + diagonal);
    }
}
