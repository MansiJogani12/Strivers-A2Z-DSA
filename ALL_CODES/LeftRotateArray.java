public class LeftRotateArray {
    public static void leftRotateByOne(int[] nums) {
        // Store the first element
        int first = nums[0];

        // Shift all elements one step to the left
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        // Put the first element at the last position
        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        leftRotateByOne(nums1);
        System.out.print("Output: ");
        for (int n : nums1) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] nums2 = {-1, 0, 3, 6};
        leftRotateByOne(nums2);
        System.out.print("Output: ");
        for (int n : nums2) {
            System.out.print(n + " ");
        }
        System.out.println();

        int[] nums3 = {7, 6, 5, 4};
        leftRotateByOne(nums3);
        System.out.print("Output: ");
        for (int n : nums3) {
            System.out.print(n + " ");
        }
    }
}

