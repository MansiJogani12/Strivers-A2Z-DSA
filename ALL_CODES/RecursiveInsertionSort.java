import java.util.Arrays;

public class RecursiveInsertionSort {

    // Recursive function to sort the array
    public static void insertionSortRecursive(int[] nums, int n) {
        // Base case: if array size is 1, it's already sorted
        if (n <= 1) return;

        // Recursively sort first n-1 elements
        insertionSortRecursive(nums, n - 1);

        // Insert nth element at correct position
        int key = nums[n - 1];
        insert(nums, n - 2, key);
    }

    // Helper function to insert key into sorted part
    public static void insert(int[] nums, int j, int key) {
        // Base case: place key if j < 0 or nums[j] <= key
        if (j < 0 || nums[j] <= key) {
            nums[j + 1] = key;
            return;
        }

        // Shift nums[j] to the right
        nums[j + 1] = nums[j];
        insert(nums, j - 1, key);
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        insertionSortRecursive(nums, nums.length);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}