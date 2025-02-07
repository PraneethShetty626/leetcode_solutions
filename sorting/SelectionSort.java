package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 8, 2, 3 };

        for (int i = 0; i < arr.length; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr) {
            System.out.printf("%d -> ", i);
        }

        System.out.println();
    }
}
