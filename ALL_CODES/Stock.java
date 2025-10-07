public class Stock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int p : prices) {
            if (p < min) {
                min = p;  // naya minimum price
            } else {
                profit = Math.max(profit, p - min);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 7, 5, 8, 11, 9};
        System.out.println(maxProfit(a1)); // Output: 6

        int[] a2 = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(a2)); // Output: 0

        int[] a3 = {3, 8, 1, 4, 6, 2};
        System.out.println(maxProfit(a3)); // Output: 5
    }
}

