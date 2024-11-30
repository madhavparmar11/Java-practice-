import java.util.Scanner;

public class FunctionAndMethodExample {
    public static void circumference(int radius) {
        if (radius <= 0) {
            System.out.println("Radius must be a positive number. Please try again.");
            return;
        }
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        
        // Check if input is a valid integer
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int radius = sc.nextInt();
            circumference(radius);  // Call the method
        }

        sc.close();  // Close the scanner
    }
}
