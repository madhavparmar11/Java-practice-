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

        // Find the index of the number x
        int index = -1; // Default value if not found
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                index = i; // Update index when found
                break; // Stop searching after the first occurrence
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }

        // Close the scanner
        sc.close();
    }
}
