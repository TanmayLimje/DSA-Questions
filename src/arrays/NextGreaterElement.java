package arrays;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main (String[] args) {
        int[] arr = {4, 5, 2, 25};
        System.out.println (Arrays.toString (arr));
        int[] result = nextGreaterElement (arr);
        System.out.println (Arrays.toString (result));
    }

    public static int[] nextGreaterElement (int[] arr) {
        int[] results = new int[arr.length];

        Stack<Integer> stack = new Stack<> ();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty () && stack.peek () <= arr[i]) {
                stack.pop ();
            }

            results[i] = stack.isEmpty () ? -1 : stack.peek ();

            stack.push (arr[i]);
        }

        return results;
    }
}
