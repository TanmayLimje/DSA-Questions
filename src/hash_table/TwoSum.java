package hash_table;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main (String[] args) {
        int[] arr ={3,4,6,2,1};
        int target  = 10;
        System.out.println (Arrays.toString (arr));
        System.out.println (target);
        int [] result = twoSum(arr,target);
        System.out.println (Arrays.toString (result));
    }

    public static int[] twoSum(int [] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<> ();

        for (int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey (complement)){
                return new int[] {map.get (complement), i};
            }

            map.put (arr[i],i);
        }

        return new int[]{};
    }
}
