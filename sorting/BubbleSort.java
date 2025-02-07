package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 6, 7, 8, 2, 3 };

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }
            for (int k : arr) {
                System.out.printf("%d -> ", k);
            }

            System.out.println();
        }

        for (int i : arr) {
            System.out.printf("%d -> ", i);
        }

        System.out.println();
    }
}
