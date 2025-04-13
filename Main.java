
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 5, 4, 3, 0, 0 };

        nextPermutation(arr);
    }

    public static void nextPermutation(int[] nums) {

        int maxIndex = getMaxIndex(nums);

        if (maxIndex == nums.length - 1) {
            reverseArray(nums, 0, nums.length - 1);
        } else {

            int smallestBefore = getSmallestIndex(nums, 0, maxIndex);
            int smallestAfter = getSmallestIndexGreaterThan(nums, smallestBefore, maxIndex, nums.length - 1);

            System.err.println(smallestAfter);

        }

    }

    static void reverseArray(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static int getMaxIndex(int[] nums) {
        int maxIndex = nums.length - 1;

        while (maxIndex > 0 && nums[maxIndex - 1] >= nums[maxIndex]) {
            maxIndex--;
        }
        return maxIndex;
    }

    static int getSmallestIndex(int[] arr, int start, int end) {
        while (start <= end - 1 && arr[start] > arr[start + 1]) {
            start++;
        }

        return start;
    }

    static int getSmallestIndexGreaterThan(int[] arr, int item, int start, int end) {
        int index = start;
        int min = item;

        while (start <= end - 1 && arr[start] > arr[start + 1]) {
            if(arr[start] > item && arr[start] < ) 
            start++;
           
        }

        return start;
    }
}