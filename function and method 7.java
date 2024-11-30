import java.util.Scanner;

public class FunctionAndMethodExample{
    public static void sum(int n) {
        int sum = 0;  // Declare sum outside the loop to keep a running total
        System.out.println("Odd numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {  // Check for odd numbers
                System.out.println(i);
                sum += i;  // Add the odd number to the total sum
            }
        }
        System.out.println("The sum of odd numbers is: " + sum);  // Print the total sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");  // Prompt for input
        int n = sc.nextInt();  // Take input for 'n'
        
        sum(n);  // Call the sum method
        sc.close();  // Close the scanner after use
    }
}
