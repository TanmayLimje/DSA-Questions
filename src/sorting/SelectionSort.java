package sorting;

import java.util.*;

public class SelectionSort {
    public static void main (String[] arg) {
        int[] arr = {4, 2, 1, 5, 6, 3};
        System.out.println (Arrays.toString (arr));
        selectSort (arr);
        System.out.println (Arrays.toString (arr));
    }

    public static void selectSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
