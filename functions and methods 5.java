import java.util.Scanner;

public class Solution {
    public static void Testing() {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Hello");
            System.out.println("Do you want to continue? (yes/no): ");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break; // Exit the infinite loop
            }
        } while (true);
        sc.close();
    }

    public static void main(String[] args) {
        Testing();
    }
}
