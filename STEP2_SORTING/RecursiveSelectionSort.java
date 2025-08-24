import java.util.*;

public class RecursiveSelectionSort {
    public static void selectionSort(int[] arr, int n, int index) {
        if (index == n) return;
        int minIndex = index;
        for (int j = index + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = temp;
        selectionSort(arr, n, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        selectionSort(arr, n, 0);
        for (int num : arr) System.out.print(num + " ");
    }
}
