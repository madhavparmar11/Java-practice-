import java.util.ArrayList;

public class Sorting {

    // Helper method to sort scores and maintain player names using Insertion Sort
    public static void insertionSort(int[] scores, String[] players) {
        int n = scores.length;

        for (int i = 1; i < n; i++) {
            int key = scores[i];  // The current element to be inserted
            String keyPlayer = players[i];  // The corresponding player's name
            int j = i - 1;

            // Move elements of scores[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && scores[j] > key) {
                scores[j + 1] = scores[j];
                players[j + 1] = players[j];  // Move the player name with the score
                j--;
            }

            // Place the key in its correct position
            scores[j + 1] = key;
            players[j + 1] = keyPlayer;  // Place the player's name at the correct position
        }
    }

    // Method to find the best players
    public static void bestPlayers() {
        String[] players = {"surbhi", "surpanakha", "shrey", "suresh", "sumit"};
        int[] scores = {3, 5, 5, 3, 5};

        // Sort scores along with player names
        insertionSort(scores, players);

        // Find the maximum score (last element in sorted array)
        int maxScore = scores[scores.length - 1];

        // Collect all players with the maximum score
        ArrayList<String> bestPlayers = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                bestPlayers.add(players[i]);
            }
        }

        // Display the best players
        System.out.println("The best players with " + maxScore + " points are:");
        for (String player : bestPlayers) {
            System.out.println(player);
        }
    }

    // Main method
    public static void main(String[] args) {
        bestPlayers();
    }
}
