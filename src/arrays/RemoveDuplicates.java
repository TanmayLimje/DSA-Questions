package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main (String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println (Arrays.toString (arr));

        int newLength = removeDuplicates (arr);
        for (int i = 0; i < newLength; i++)
            System.out.print (arr[i] + " ");
    }

    public static int removeDuplicates(int []arr){
        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;
    }
}
