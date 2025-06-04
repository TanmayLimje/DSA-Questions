package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main (String[] args) {
        int[] arr = {1,2,2,3,4,4,4};
        int[] arr2 = {1,2,2,1,1,2,2,7};

        System.out.println (Arrays.toString (arr));
        System.out.println (Arrays.toString (arr2));

        System.out.println (unionArray(arr2,arr));
    }

    private static HashSet<Integer> unionArray (int[] arr2, int[] arr) {
        HashSet<Integer> set = new HashSet<> ();
        for (int a: arr){
            set.add (a);
        }
        for (int b: arr2){
            set.add (b);
        }

        return set;
    }


}
