import java.util.Arrays;

public class InsertionSort {

    // Function to perform insertion sort
    public static int[] insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Insert key at correct position
            nums[j + 1] = key;
        }

        return nums;
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        int[] sorted = insertionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}
