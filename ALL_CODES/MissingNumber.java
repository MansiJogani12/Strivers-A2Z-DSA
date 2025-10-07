public class MissingNumber {
    public static int findMissing(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 2, 3, 1, 4};
        System.out.println(findMissing(nums1)); // 5

        int[] nums2 = {0, 1, 2, 4, 5, 6};
        System.out.println(findMissing(nums2)); // 3

        int[] nums3 = {1, 3, 6, 4, 2, 5};
        System.out.println(findMissing(nums3)); // 0

        int[] nums4 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(findMissing(nums4)); // 8
    }
}
