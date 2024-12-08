import java.util.Scanner;

public class BitManipulation {
    public static void checkBit(int n, int p) {
        int bitmask = 1 << n; // Create a bitmask by shifting 1 left by n positions
        int bit = (bitmask & p) != 0 ? 1 : 0; // Check if the nth bit is set
        System.out.println("The " + n + "the bit is: " + bit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the position of the bit to check (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the number to check (p): ");
        int p = sc.nextInt();

        // Call the method with user input
        checkBit(n, p);

        // Close the scanner
        sc.close();
    }
}
