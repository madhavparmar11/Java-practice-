import java.util.Scanner;

public class FunctionAndMethodExample {
    public static void CheckAge(int age) {
        if (age > 18) {
            System.out.println("You are an adult; you can vote.");
        } else if (age == 18) {
            System.out.println("You are 18 years old; you can vote.");
        } else {
            System.out.println("You are a minor; you can't vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid age.");
        } else {
            int age = sc.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be negative. Please enter a valid age.");
            } else {
                CheckAge(age);  // Call the CheckAge method
            }
        }

        sc.close();  // Close the scanner
    }
}
