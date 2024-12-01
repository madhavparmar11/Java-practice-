import java.util.Scanner;

public class Main {
    public static void Duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found duplicate: " + arr[i]);
                }
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

        // Call the Duplicate method
        Duplicate(arr);

        // Close the Scanner
        sc.close();
    }
}
