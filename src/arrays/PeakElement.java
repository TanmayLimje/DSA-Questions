package arrays;

import java.util.Arrays;

public class PeakElement {
    public static void main (String[] args) {
        int[] arr = {2, 5, 4, 20, 7, 3};
        System.out.println (Arrays.toString (arr));
        int peak = peakElement (arr);
        System.out.println (arr[peak]);
    }

    public static int peakElement (int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] < arr[mid+1]){
                low = mid+1;
            }else {
                high = mid;
            }
        }
        return low;
    }
}
