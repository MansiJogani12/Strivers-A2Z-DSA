import java.util.*;

public class UnionArray {
    public static List<Integer> union(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            while (i > 0 && i < nums1.length && nums1[i] == nums1[i - 1]) i++;
            while (j > 0 && j < nums2.length && nums2[j] == nums2[j - 1]) j++;

            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) result.add(nums1[i++]);
                else if (nums1[i] > nums2[j]) result.add(nums2[j++]);
                else {
                    result.add(nums1[i]);
                    i++; j++;
                }
            }
        }

        while (i < nums1.length) {
            if (i == 0 || nums1[i] != nums1[i - 1]) result.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            if (j == 0 || nums2[j] != nums2[j - 1]) result.add(nums2[j]);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        System.out.println(union(nums1, nums2));
    }
}

