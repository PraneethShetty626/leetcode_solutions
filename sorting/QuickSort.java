package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 8, 2, 3, 1, 3 };
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void sort(int[] arr, int i, int j) {
        if (i < j) {
            int index = quickSort(arr, i, j);

            sort(arr, i, index - 1);
            sort(arr, index + 1, j);
        }
    }

    public static int quickSort(int[] arr, int start, int end) {
        int pivot = arr[start];

        int i = start;
        int j = end;

        while (i < j) {
            while (arr[i] <= pivot && i < end) {
                i++;
            }

            while (arr[j] > pivot && j > start) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, start, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
