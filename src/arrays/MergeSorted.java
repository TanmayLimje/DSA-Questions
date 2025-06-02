package arrays;

import java.util.Arrays;

public class MergeSorted {
    public static void main (String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println (Arrays.toString (arr1));
        System.out.println (Arrays.toString (arr2));

        int[] merge = mergeSorted (arr1, arr2);
        System.out.println (Arrays.toString (merge));
    }

    public static int[] mergeSorted (int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int index = 0, i= 0, j = 0;
        int[] result = new int[n+m];

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                result[index] = arr1[i];
                i++;
                index++;
            }else {
                result[index] = arr2[j];
                j++;
                index++;
            }
        }

        while (i < n){
            result[index] = arr1[i];
            i++;
            index++;
        }
        while (j < m){
            result[index] = arr2[j];
            j++;
            index++;
        }

        return result;
    }
}
