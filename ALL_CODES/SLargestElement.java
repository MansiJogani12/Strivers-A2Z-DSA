public class SLargestElement {

    public static int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] nums1 = {8, 8, 7, 6, 5};
        int[] nums2 = {10, 10, 10, 10, 10};
        int[] nums3 = {7, 7, 2, 2, 10, 10, 10};

        System.out.println(secondLargest(nums1)); // Output: 7
        System.out.println(secondLargest(nums2)); // Output: -1
        System.out.println(secondLargest(nums3)); // Output: 7
    }
}
