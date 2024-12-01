import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int x = 2; // The target number to search for

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Create a dynamic list to store elements
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt user to input array elements
        System.out.println("Enter the elements of the array (type -1 to stop): ");

        while (true) {
            int input = sc.nextInt();
            if (input == -1) { // Sentinel value to stop taking input
                break;
            }
            list.add(input); // Add the input to the list
        }

        // Check if the number x is present in the list
        boolean found = false;
        for (int num : list) {
            if (num == x) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // Close the scanner
        sc.close();
    }
}
