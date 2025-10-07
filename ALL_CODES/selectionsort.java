import java.util.Arrays;

public class selectionsort {

    public static int[] selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        int[] sorted = selectionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(sorted));
    }
}