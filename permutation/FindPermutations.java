package permutation;

import java.util.ArrayList;
import java.util.List;

public class FindPermutations {
    public List<int[]> getAllPermutations(int[] arr) {
        List<int[]> reList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int[] subArray = getCopy(i, arr);

            List<int[]> subPerm = getAllPermutations(subArray);

            if (subArray.length == 0) {
                reList.add(arr);
                return reList;
            }

            for (int[] perm : subPerm) {

                int[] indPerm = new int[arr.length];
                int c = 0;

                indPerm[c++] = arr[i];

                for (int item : perm) {
                    indPerm[c++] = item;
                }

                // printArray(indPerm);

                reList.add(indPerm);
            }

        }

        return reList;

    }

    int[] getCopy(int ign, int[] arr) {
        int[] ret = new int[arr.length - 1];

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != ign)
                ret[k++] = arr[i];
        }
        return ret;
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
