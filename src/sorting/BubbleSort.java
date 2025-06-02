package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] arg) {
        int[] arr = {4, 2, 6, 1, 3, 5};
//        System.out.println (arr);
        System.out.println (Arrays.toString (arr));
        bubbleSort (arr);
        System.out.println (Arrays.toString (arr));
    }

    public static void bubbleSort (int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
