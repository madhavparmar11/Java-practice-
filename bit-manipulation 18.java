import java.util.Scanner;

public class BitManipulation {
    public static void performOrOperation(int n, int p) {
        int bitmask = 1 << n; // Create a bitmask by shifting 1 left by n positions
        int result = bitmask | p; // Perform the OR operation
        System.out.println("The result after OR operation is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the position of the bit to set (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the number to modify (p): ");
        int p = sc.nextInt();

        // Call the method with user input
        performOrOperation(n, p);

        // Close the scanner
        sc.close();
    }
}
