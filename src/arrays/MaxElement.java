package arrays;

import java.util.Arrays;

public class MaxElement {
    public static void main (String[] args) {
        int [] arr = {6,1,4,6,7,2,3,5};
        System.out.println (Arrays.toString (arr));
        int max = maxElement(arr);
        System.out.println (max);
    }

    public static int maxElement(int [] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
