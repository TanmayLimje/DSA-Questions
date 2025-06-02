package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] arg){
        int [] arr = {5,3,2,6,1,4};
        System.out.println (Arrays.toString (arr));
        quickSort(arr,0,arr.length-1);
        System.out.println (Arrays.toString (arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right) {
            int pivotIndex = pivot (arr, left, right);
            quickSort (arr, left, pivotIndex - 1);
            quickSort (arr, right, pivotIndex + 1);
        }
    }

    private static void swap(int [] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static int pivot(int [] arr, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for (int i = pivotIndex+1; i <= endIndex; i++){
            if(arr[i] < arr[pivotIndex]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap (arr, pivotIndex, swapIndex);
        return swapIndex;
    }


}
