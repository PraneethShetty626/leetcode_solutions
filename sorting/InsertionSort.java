package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 8, 2, 3, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            int index = i;

            while (index > 0 && arr[index - 1] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;

                index--;
            }

            System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
}
