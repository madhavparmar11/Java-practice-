import java.util.Scanner;

public class Main {

    public static void Checker(int[] arr) {
        // Iterate through the array, skipping the first and last element
        for (int i = 1; i < arr.length - 1; i++) {
            // Check if the current number is greater than both its predecessor and successor
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Found a number greater than both its predecessor and successor: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Create the array
        int[] arr = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the Checker method to check for the condition
        Checker(arr);

        // Close the scanner
        sc.close();
    }
}
