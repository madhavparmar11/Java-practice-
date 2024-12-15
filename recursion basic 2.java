public class Recursion {
    public static int Numbers(int n) {
        if (n > 5) { // Base case: Stop when n exceeds 5
            return 0; // Return 0 when recursion stops
        }
        System.out.print(n + " "); // Print the current number
        int sum = n + Numbers(n + 1); // Recursive call to calculate the sum
        if (n == 1) { // Print the sum only once, when returning to the first call
            System.out.println("\nThe sum of numbers is: " + sum);
        }
        return sum; // Return the sum to the previous recursive call
    }

    public static void main(String[] args) {
        Numbers(1); // Start from 1
    }
}
