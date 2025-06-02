package strings;

import java.util.Stack;

public class StackReverse {
    public static void main (String[] args) {
        String str = "Tanmay";
        System.out.println (str);
        String reverse = stackReverse(str);
        System.out.println (reverse);
    }

    public static String stackReverse(String str){
        Stack<Character> stack = new Stack<> ();

        for (char c: str.toCharArray ()){
            stack.push (c);
        }

        StringBuilder reverse = new StringBuilder ();
        while (!stack.isEmpty ()){
            reverse.append (stack.pop ());
        }

        return reverse.toString ();
    }
}
