import java.util.*;

public class SubarraySumK {

    public static int longestSubarrayWithSumK(int[] nums, int k) {
        // Map to store prefixSum -> earliest index
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: subarray from start (0..i)
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray ending at i (remove prefix)
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence of prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println(longestSubarrayWithSumK(nums1, k1)); // Output: 4

        int[] nums2 = {-3, 2, 1};
        int k2 = 6;
        System.out.println(longestSubarrayWithSumK(nums2, k2)); // Output: 0

        int[] nums3 = {-1, 1, 1};
        int k3 = 1;
        System.out.println(longestSubarrayWithSumK(nums3, k3)); // Output: 2
    }
}
