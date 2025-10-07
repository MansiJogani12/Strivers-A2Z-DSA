import java.util.*;

public class SubArrSum {
    public static int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum = 0 initially
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        System.out.println(countSubarrays(nums1, 2)); // Output: 2

        int[] nums2 = {1, 2, 3};
        System.out.println(countSubarrays(nums2, 3)); // Output: 2

        int[] nums3 = {3, 1, 2, 4};
        System.out.println(countSubarrays(nums3, 6)); // Output: 2
    }
}

