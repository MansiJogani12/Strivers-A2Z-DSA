
public class Kadane {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Print subarray
        System.out.print("Subarray with max sum: [");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + (i < end ? ", " : ""));
        }
        System.out.println("]");

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, -2, 7, -4};
        System.out.println("Max Sum = " + maxSubArray(nums1));

        int[] nums2 = {-2, -3, -7, -2, -10, -4};
        System.out.println("Max Sum = " + maxSubArray(nums2));

        int[] nums3 = {-1, 2, 3, -1, 2, -6, 5};
        System.out.println("Max Sum = " + maxSubArray(nums3));
    }
}
