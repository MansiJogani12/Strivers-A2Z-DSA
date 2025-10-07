public class LinearSearch {
    public static int search(int[] nums, int target) {
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return first occurrence
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5, 3};
        int target1 = 3;
        System.out.println("Output: " + search(nums1, target1)); // 1

        int[] nums2 = {2, -4, 4, 0, 10};
        int target2 = 6;
        System.out.println("Output: " + search(nums2, target2)); // -1

        int[] nums3 = {1, 3, 5, -4, 1};
        int target3 = 1;
        System.out.println("Output: " + search(nums3, target3)); // 0
    }
}

