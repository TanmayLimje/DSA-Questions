package arrays;

import java.util.Arrays;

public class ZerosAtEnd {
    public static void main (String[] args) {
        int[] arr = {6, 3, 0, 2, 1, 0, 32, 1, 0, 2};
        System.out.println (Arrays.toString (arr));
        moveZerosAtEnd (arr);
        System.out.println (Arrays.toString (arr));
    }

    private static void moveZerosAtEnd (int[] arr) {
        int index = 0;

        for (int num : arr) {
            if (num != 0){
                arr[index] = num;
                index ++;
            }
        }
        while (index < arr.length){
            arr[index] = 0;
            index++;
        }
    }
}
