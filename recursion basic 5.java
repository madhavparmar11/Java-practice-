import java.util.Scanner;

public class Recursion {
    // This method will calculate the factorial of a number 'n'
    public static int factorial(int n) {
        if (n == 1 || n == 0) { // Base case: factorial of 1 or 0 is 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive call: n * factorial(n-1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int i = sc.nextInt(); // Get the number for factorial calculation
        int result = factorial(i); // Calculate the factorial
        System.out.println("The factorial of " + i + " is: " + result);
    }
}
