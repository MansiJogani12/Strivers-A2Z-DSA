import java.util.Arrays;

public class QuickSort {

    // Function to perform quick sort
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(nums, low, high);

            // Recursively sort elements before and after partition
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    // Partition function using Lomuto partition scheme
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high]; // Choose last element as pivot
        int i = low - 1;         // Index of smaller element

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Swap pivot to correct position
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};

        quickSort(nums, 0, nums.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}