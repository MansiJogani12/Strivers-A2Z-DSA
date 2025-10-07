import java.util.*;

public class MajElem2 {
    public static List<Integer> majorityElement(int[] nums) {
        int cand1 = 0, cand2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == cand1) {
                count1++;
            } else if (num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // verify candidates
        count1 = 0; count2 = 0;
        for (int num : nums) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) res.add(cand1);
        if (count2 > n / 3) res.add(cand2);

        Collections.sort(res); // ascending order
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 1, 3, 2};
        System.out.println(majorityElement(nums1)); // [1]

        int[] nums2 = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(majorityElement(nums2)); // [1, 2]

        int[] nums3 = {1, 2, 1, 1, 3, 2, 2, 3};
        System.out.println(majorityElement(nums3)); // [1, 2]
    }
}

