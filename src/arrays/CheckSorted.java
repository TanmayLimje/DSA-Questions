package arrays;

import java.util.Arrays;

public class CheckSorted {
    public static void main (String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println (Arrays.toString (arr));
        System.out.println (isSorted(arr));
    }

    private static boolean isSorted (int[] arr) {
        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]) isDesc = false;
            if(arr[i] < arr[i-1]) isAsc = false;
        }

        return isAsc || isDesc;
    }

}
