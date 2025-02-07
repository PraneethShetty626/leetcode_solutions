package sorting;

public class PrintData {
    public static <T> void printArray(T[] arr) {
        for (T i : arr) {
            System.out.printf(i + " -> ");
        }

        System.out.println();
    }
}