package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main (String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 2;

        System.out.println (Arrays.toString (arr));

        rotateArray (arr, k);

        System.out.println (Arrays.toString (arr));
    }

    public static void rotateArray (int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-1);
        reverse (arr,0,k);
        reverse (arr,k,n-1);

    }

    private static void reverse(int [] arr, int start, int end){
        while (start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
