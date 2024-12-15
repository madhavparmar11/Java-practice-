import java.util.Scanner;

public class Recursion {
    // This method will print the multiplication table for 'i'
    public static void Numbers(int n, int i) {
        if (n == 11) { // Base case: Stop when n reaches 11
            return;
        }
        System.out.println(i + " x " + n + " = " + (i * n)); // Print the table entry
        Numbers(n + 1, i); // Recursive call to print the next line of the table
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int i = sc.nextInt(); // Get the number for the multiplication table
        Numbers(1, i); // Start recursion with 1 (first multiplier) and the number 'i' for table
    }
}
