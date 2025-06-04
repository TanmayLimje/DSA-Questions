package arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main (String[] args) {
        int arr[] = {6,7,8,9,7,9};
        int result = secondLargest(arr);
        System.out.println (Arrays.toString (arr));
        System.out.println (result);
    }

    private static int secondLargest (int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num: arr){
            if(num > largest){
                second = largest;
                largest = num;
            }else if(num > second && num != largest){
                second = num;
            }
        }

        return second;
    }
}
