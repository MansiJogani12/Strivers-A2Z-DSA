import java.util.*;

public class LongSubK {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            // Case 1: subarray starts from index 0
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray exists between previous prefix and current
            if (prefixMap.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - prefixMap.get(prefixSum - k));
            }

            // Store first occurrence of prefixSum
            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
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
