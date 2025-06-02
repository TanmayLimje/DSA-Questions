package arrays;

import java.util.Arrays;

public class FirstAndLastOcc {
    public static void main (String[] args) {
        int[] arr = {2, 2, 4, 5, 8, 8, 8, 8, 9};//[4,7]
        int target = 8;

        int[] result = searchRange (arr, target);
        System.out.println (Arrays.toString (arr));
        System.out.println (Arrays.toString (result));
    }

    public static int[] searchRange (int[] arr, int target) {
        int first = findBound (arr, target, true);
        int second = findBound (arr, target, false);
        return new int[]{first, second};
    }

    private static int findBound (int[] arr, int target, boolean isFirst) {
        int low = 0;
        int high = arr.length - 1;
        int bound = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target){
                bound = mid;
                if (isFirst){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            } else if (arr[mid] < target) {
                low = mid+1;
            }else {
                high= mid-1;
            }
        }
        return bound;
    }
}
