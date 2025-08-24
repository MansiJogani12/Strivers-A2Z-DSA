import java.util.*;

public class RecursiveInsertionSort {
    public static void insertionSort(int[] arr, int n) {
        if (n <= 1) return;
        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        insertionSort(arr, n);
        for (int num : arr) System.out.print(num + " ");
    }
}
