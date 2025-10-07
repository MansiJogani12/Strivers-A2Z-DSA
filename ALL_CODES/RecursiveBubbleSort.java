import java.util.Arrays;

public class RecursiveBubbleSort {

    // Recursive function to perform bubble sort
    public static void bubbleSortRecursive(int[] nums, int n) {
        // Base case: if array size is 1, it's already sorted
        if (n == 1) {
            return;
        }

        // One pass of bubble sort: push largest element to the end
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                // Swap adjacent elements if out of order
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

        // Recursive call for remaining unsorted part
        bubbleSortRecursive(nums, n - 1);
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        bubbleSortRecursive(nums, nums.length);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
