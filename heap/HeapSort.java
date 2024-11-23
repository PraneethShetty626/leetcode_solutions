package heap;

public class HeapSort {

    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void heapify(int[] arr, int index){
        print(arr);
        for(int i = 0 ; i <= index ; i++) {
            int j  =  i;

            while(arr[j / 2] > arr[j]){
                int temp = arr[j / 2];
                arr[j / 2] = arr[j];
                arr[j] = temp;

                j = j / 2;
            }
        }
        print(arr);

    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        
        int index = arr.length - 1;

        heapify(arr, index);

        for(int i = 0 ; i < arr.length ; i++){
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index--]=temp;

            heapify(arr, index);
        }

    }
}