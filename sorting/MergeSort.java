package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 8, 2, 3, 1, 3 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        // Merge elements from both halves into temp[]
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back into original array
        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }

        System.out.println("Merged: " + Arrays.toString(temp));
    }
}
