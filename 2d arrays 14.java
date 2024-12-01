import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int x = 2; // The number to search for

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create the 2D array
        int[][] arr = new int[rows][cols];

        // Input the elements of the 2D array
        System.out.println("Enter the elements of the 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Search for the number and print its index
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Found at row: " + i + ", column: " + j);
                    found = true;
                    break; // Stop searching after finding the first occurrence
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        // Close the scanner
        sc.close();
    }
}
