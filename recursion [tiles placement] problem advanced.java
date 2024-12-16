import java.util.Scanner;

public class Main { 
    // Method to calculate tile placements
    public static int TilesPlacement(int n, int m) { 
        if (n == m) {
            return 2; // Base case: if n and m are equal, two ways to place tiles
        }
        if (n < m) {
            return 1; // Base case: if n is smaller than m, only one way to place tiles
        }

        // Horizontally placing a tile (reduce rows by 1)
        int horizontally = TilesPlacement(n - 1, m);

        // Vertically placing a tile (reduce rows by m)
        int vertically = TilesPlacement(n - m, m);

        // Total placements of tiles
        return horizontally + vertically; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter value for n (length of the floor): ");
        int n = scanner.nextInt();
        System.out.print("Enter value for m (length of the tile): ");
        int m = scanner.nextInt();

        // Calculate and display the result
        int result = TilesPlacement(n, m);
        System.out.println("Total placements of tiles: " + result);

        scanner.close();
    }
}
