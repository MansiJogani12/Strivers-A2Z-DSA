import java.util.Arrays;

public class MergeSort {

    // Function to perform merge sort
    public static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;

        // Divide the array into two halves
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Helper function to merge two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy remaining elements from right array
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        int[] sorted = mergeSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}