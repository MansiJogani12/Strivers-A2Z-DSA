import java.util.*;

public class Leaders {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;

        int maxRight = nums[n - 1];
        leaders.add(maxRight); // rightmost element is always leader

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxRight) {
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }

        // reverse to maintain original order
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 3, 1, 2};
        System.out.println(findLeaders(nums1)); // [5, 3, 2]

        int[] nums2 = {-3, 4, 5, 1, -4, -5};
        System.out.println(findLeaders(nums2)); // [5, 1, -4, -5]

        int[] nums3 = {-3, 4, 5, 1, -30, -10};
        System.out.println(findLeaders(nums3)); // [5, 1, -10]
    }
}

