package arrays;

import java.util.Arrays;

public class MissingPositive {
    public static void main (String[] args) {
        int[] arr = {3,4,-1,2};
        System.out.println (Arrays.toString (arr));
        System.out.println (smallestMissingPositive(arr));
    }

    private static int smallestMissingPositive (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            while (arr[i] > 0 && arr[i] <= arr.length && arr[arr[i] - 1] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return arr.length + 1;
    }
}
