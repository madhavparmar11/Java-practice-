import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Create an array of the specified size
        int[] array = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        // Print the array
        System.out.println("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
