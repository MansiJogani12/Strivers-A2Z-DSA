public class CheckIfSorted {
    public static boolean isSorted(int[] nums) {
        // Loop through array and check order
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false; // condition fails
            }
        }
        return true; // array is sorted
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 1, 4, 5};
        int[] nums3 = {1, 9, 6, 8, 5, 4, 0};

        System.out.println(isSorted(nums1)); // true
        System.out.println(isSorted(nums2)); // false
        System.out.println(isSorted(nums3)); // false
    }
}

