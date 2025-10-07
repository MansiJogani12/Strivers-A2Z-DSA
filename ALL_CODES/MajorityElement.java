public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(nums1)); // Output: 7

        int[] nums2 = {1, 1, 1, 2, 1, 2};
        System.out.println(majorityElement(nums2)); // Output: 1

        int[] nums3 = {-1, -1, -1, -1};
        System.out.println(majorityElement(nums3)); // Output: -1
    }
}

