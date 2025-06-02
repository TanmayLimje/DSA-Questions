package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main (String[] arg) {
        int[] arr = {5, 6, 3, 4, 2, 1, 7};
        System.out.println (Arrays.toString (arr));
        insertionSort (arr);
        System.out.println (Arrays.toString (arr));

    }

    public static void insertionSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j > -1 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
