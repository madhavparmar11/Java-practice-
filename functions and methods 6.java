import java.util.Scanner;

public class CommonDivisors {

    // Function to calculate the GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find and print all common divisors
    public static void findCommonDivisors(int a, int b) {
        int gcdValue = gcd(a, b); // Find GCD of a and b

        System.out.println("Common Divisors of " + a + " and " + b + ":");
        for (int i = 1; i <= Math.sqrt(gcdValue); i++) {
            if (gcdValue % i == 0) {
                System.out.print(i + " "); // Divisor
                if (i != gcdValue / i) {
                    System.out.print((gcdValue / i) + " "); // Complement divisor
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Find and display common divisors
        findCommonDivisors(a, b);

        sc.close();
    }
}
