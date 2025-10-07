public class NextPerm {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: if such element found, find just larger element and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        nextPermutation(nums1);
        for (int x : nums1) System.out.print(x + " ");
        System.out.println(); // Output: 1 3 2

        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        for (int x : nums2) System.out.print(x + " ");
        System.out.println(); // Output: 1 2 3

        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        for (int x : nums3) System.out.print(x + " ");
        System.out.println(); // Output: 1 5 1
    }
}
