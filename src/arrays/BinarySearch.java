package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main (String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 9};
        int target = 8;
        System.out.println (Arrays.toString (arr));
        System.out.println (target);

        int index = binarySearch (arr, target);
        System.out.println (index);
    }

    private static int binarySearch (int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
