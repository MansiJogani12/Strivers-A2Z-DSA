class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // Edge case: if array is empty
        if (nums.length == 0) return 0;

        // Pointer for unique elements
        int k = 1;

        // Traverse from the 2nd element
        for (int i = 1; i < nums.length; i++) {
            // If current element is different from previous unique element
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Place unique element
                k++;
            }
        } 
        return k; // Number of unique elements
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 3, 3, 5, 6};
        int k1 = removeDuplicates(nums1);
        System.out.print("Unique count = " + k1 + " | Result = ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {-2, 2, 4, 4, 4, 4, 5, 5};
        int k2 = removeDuplicates(nums2);
        System.out.print("Unique count = " + k2 + " | Result = ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        int[] nums3 = {-30, -30, 0, 0, 10, 20, 30, 30};
        int k3 = removeDuplicates(nums3);
        System.out.print("Unique count = " + k3 + " | Result = ");
        for (int i = 0; i < k3; i++) {
            System.out.print(nums3[i] + " ");
        }
    }
}
