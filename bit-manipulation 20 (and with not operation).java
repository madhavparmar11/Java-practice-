import java.util.Scanner;

public class BitManipulation {
    public static void performAndWithNotOperation(int n, int p) {
        int bitmask = 1 << n; // Create a bitmask by shifting 1 left by n positions
        int result = bitmask & ~p; // Perform the AND operation between bitmask and NOT p
        
        System.out.println("The result after AND with NOT operation is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the position of the bit to clear (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the number to modify (p): ");
        int p = sc.nextInt();

        // Call the method with user input
        performAndWithNotOperation(n, p);

        // Close the scanner
        sc.close();
    }
}
