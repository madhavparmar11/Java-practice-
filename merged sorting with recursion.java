public class MergeSort {
    // Merge two sorted subarrays
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;       // Pointer for the left subarray
        int j = mid + 1;  // Pointer for the right subarray
        int k = 0;        // Pointer for the merged array

        // Merge elements from both subarrays into temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left subarray (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray (if any)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back into the original array
        for (i = 0, k = si; k <= ei; i++, k++) {
            arr[k] = temp[i];
        }
    }

    // Divide and Conquer
    public static void DAC(int[] arr, int si, int ei) {
        if (si >= ei) {
            return; // Base case: single element or empty array
        }

        // Find the middle index
        int mididx = si + (ei - si) / 2;

        // Recursively sort the left and right halves
        DAC(arr, si, mididx);
        DAC(arr, mididx + 1, ei);

        // Merge the two sorted halves
        merge(arr, si, mididx, ei);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        // Perform merge sort
        DAC(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
