package arrays;

import java.util.Arrays;

public class MaxProductOfTwo {
    public static void main (String[] args) {
        int[] nums = {-10, -3, 5, 6, -2};
        System.out.println (Arrays.toString (nums));
        int maxProduct = maxProductOfTwo (nums);
        System.out.println (maxProduct);
    }

    public static int maxProductOfTwo (int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max (max1 * max2, min1 * min2);
    }
}
