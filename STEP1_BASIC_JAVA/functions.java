
public class functions {
    static void changeValue(int num) {
        num = 50;
    }

    static void changeArray(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int x = 10;
        changeValue(x);
        System.out.println("After changeValue: " + x);

        int[] nums = {1, 2, 3};
        changeArray(nums);
        System.out.println("After changeArray: " + nums[0]);
    }
}
