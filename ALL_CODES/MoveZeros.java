public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int index = 0; // position to place the next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Step 2: Fill the rest with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 4, 0, 5, 2};
        moveZeroes(nums1);
        System.out.print("Output: ");
        for (int n : nums1) System.out.print(n + " ");
    }
}

