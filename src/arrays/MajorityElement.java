package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main (String[] args) {
        int[] arr = {2, 2, 4, 4, 32, 1, 2, 2, 2};
        System.out.println (Arrays.toString (arr));
        System.out.println (majorityElement (arr));
    }

    private static int majorityElement (int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        int threshold = arr.length / 2;

        for (int num : arr) {
            map.put (num, map.getOrDefault (num, 0) + 1);
            if (map.get (num) > threshold) return num;
        }

        return -1;
    }

}
