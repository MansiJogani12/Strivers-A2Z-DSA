public class SingleNum {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR accumulates
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4, 3, 1, 4};
        System.out.println(singleNumber(nums1)); // 3

        int[] nums2 = {5};
        System.out.println(singleNumber(nums2)); // 5

        int[] nums3 = {1, 3, 10, 3, 5, 1, 5};
        System.out.println(singleNumber(nums3)); // 10
    }
}
