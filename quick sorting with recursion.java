public class CompetitionWinner {
    // Partition method to sort two arrays
    public static int partition(int[] bob, int[] james, int low, int high) {
        int pivot = bob[high]; // Use last element of bob array as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Compare elements with pivot
            if (bob[j] <= pivot) {
                i++;
                // Swap bob
                int tempBob = bob[i];
                bob[i] = bob[j];
                bob[j] = tempBob;

                // Swap corresponding james
                int tempJames = james[i];
                james[i] = james[j];
                james[j] = tempJames;
            }
        }

        // Place pivot in correct position
        int tempBob = bob[i + 1];
        bob[i + 1] = bob[high];
        bob[high] = tempBob;

        int tempJames = james[i + 1];
        james[i + 1] = james[high];
        james[high] = tempJames;

        return i + 1; // Return pivot index
    }

    // QuickSort method for two arrays
    public static void quickSort(int[] bob, int[] james, int low, int high) {
        if (low < high) {
            // Partition index
            int pivotIndex = partition(bob, james, low, high);

            // Recursively sort elements before and after partition
            quickSort(bob, james, low, pivotIndex - 1);
            quickSort(bob, james, pivotIndex + 1, high);
        }
    }

    // Determine the winner
    public static String determineWinner(int[] bob, int[] james) {
        // Maximum scores are the last elements in the sorted arrays
        int maxBob = bob[bob.length - 1];
        int maxJames = james[james.length - 1];

        // Determine winner based on maximum scores
        if (maxBob > maxJames) {
            return "Bob is the winner with the highest score of " + maxBob;
        } else if (maxJames > maxBob) {
            return "James is the winner with the highest score of " + maxJames;
        } else {
            return "It's a tie! Both have the highest score of " + maxBob;
        }
    }

    public static void main(String[] args) {
        int[] bob = {4, 2, 7, 1, 3};    // Bob's scores
        int[] james = {40, 20, 70, 10, 30}; // James's scores

        System.out.println("Before sorting:");
        System.out.println("Bob's scores: " + java.util.Arrays.toString(bob));
        System.out.println("James's scores: " + java.util.Arrays.toString(james));

        // Sort both arrays
        quickSort(bob, james, 0, bob.length - 1);

        System.out.println("\nAfter sorting:");
        System.out.println("Bob's scores: " + java.util.Arrays.toString(bob));
        System.out.println("James's scores: " + java.util.Arrays.toString(james));

        // Determine and print the winner
        String winner = determineWinner(bob, james);
        System.out.println("\n" + winner);
    }
}
