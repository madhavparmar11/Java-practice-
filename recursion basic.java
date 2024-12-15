public class Recursion {
    public static void Numbers(int n) {
        if (n > 5) { // Base case: Stop when n exceeds 5
            return;
        }
        System.out.print(n + " "); // Print the current number
        Numbers(n + 1); // Recursive call with n incremented by 1
    }

    public static void main(String[] args) {
        Numbers(1); // Start from 1
    }
}
