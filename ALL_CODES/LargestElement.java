public class LargestElement {
    public static void main(String[] args) {
        // Example input
        int[] nums = {3, 3, 0, 99, -40};

        // Call function to find largest
        int largest = findLargest(nums);

        // Print result
        System.out.println("Largest element: " + largest);
    }

    // Function to return largest element in array
    public static int findLargest(int[] nums) {
        // Assume first element is largest
        int max = nums[0];

        // Traverse array to find max
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];  // update max
            }
        }

        return max;
    }
}

