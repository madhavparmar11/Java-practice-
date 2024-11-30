import java.util.Scanner;
import java.util.regex.Matcher;
public class Main {
    public static void average(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;  // Calculate average
        System.out.println("The average of " + a + ", " + b + ", " + c + " is: " + average);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for three integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        average(a, b, c);  // Call the average method
        sc.close();  // It's good practice to close the scanner after use
    }
}
