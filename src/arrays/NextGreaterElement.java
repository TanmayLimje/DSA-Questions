package arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main (String[] args) {
        int [] arr = {4,5,2,25};
        System.out.println (Arrays.toString (arr));
        int[] result = nextGreaterElement(arr);
        System.out.println (Arrays.toString (result));
    }
}
