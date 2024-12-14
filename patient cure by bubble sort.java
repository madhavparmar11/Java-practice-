public class Sorting {
    // Helper method to sort an array using Bubble Sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to check if cure is available
    public static void cure() {
        int[] data1 = {123, 146, 454, 542, 456};
        int[] data2 = {100, 328, 248, 689, 200};

        // Sort both arrays
        bubbleSort(data1);
        bubbleSort(data2);

        // Compare elements of both sorted arrays
        for (int i = 0; i < data1.length; i++) {
            if (data1[i] == data2[i]) {
                System.out.println("Cure available");
            } else if (data1[i] < data2[i]) {
                System.out.println("Cure not available");
            } else {
                System.out.println("Cure not available");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        cure();
    }
}
