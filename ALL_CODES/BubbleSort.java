import java.util.Arrays;

public class BubbleSort {

    // Function to perform bubble sort
    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap if elements are in wrong order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) break;
        }

        return nums;
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        int[] sorted = bubbleSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}