package arrays;

import java.util.Arrays;

public class SingleNumberXOR {
    public static void main (String[] args) {
        int[] arr = {2,3,4,3,2,5,5};
        System.out.println (Arrays.toString (arr));
        int result = singleNumberXOR(arr);
        System.out.println (result);
    }

    private static int singleNumberXOR (int[] arr) {
        int unique = 0;
        for (int num: arr){
            unique ^= num;
        }
        return unique;
    }


}
