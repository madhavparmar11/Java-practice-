public class ArrayExample {
    public static void FindMinMax(int[] arr) {
        // Initialize min and max to the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Traverse the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the results
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 73, 3, 6, 8};
        FindMinMax(arr);
    }
}
