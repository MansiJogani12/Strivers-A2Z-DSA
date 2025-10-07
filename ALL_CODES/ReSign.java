public class ReSign {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1; // positive ke liye even index, negative ke liye odd index

        for (int x : nums) {
            if (x > 0) {
                ans[pos] = x;
                pos += 2;
            } else {
                ans[neg] = x;
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 5, -1, -3, -4};
        int[] res1 = rearrangeArray(nums1);
        for (int x : res1) System.out.print(x + " ");
        System.out.println(); // Output: 2 -1 4 -3 5 -4

        int[] nums2 = {1, -1, -3, -4, 2, 3};
        int[] res2 = rearrangeArray(nums2);
        for (int x : res2) System.out.print(x + " ");
        System.out.println(); // Output: 1 -1 2 -3 3 -4

        int[] nums3 = {-4, 4, -4, 4, -4, 4};
        int[] res3 = rearrangeArray(nums3);
        for (int x : res3) System.out.print(x + " ");
        System.out.println(); // Output: 4 -4 4 -4 4 -4
    }
}

