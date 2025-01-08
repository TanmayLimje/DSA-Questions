/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
1.Open brackets must be closed by the same type of brackets.
2.Open brackets must be closed in the correct order.
3.Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
*/

public class Valid_parentheses {

    public static boolean isValid(String s){
        if(s.length() == 0) return true;

        Map<Character,Character> parans = new HashMap<>();
        parans.put('{','}');
        parans.put('(',')');
        parans.put('[',']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            if(parans.containsKey(current)){
                stack.push(current);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }

                char leftBracket = stack.pop();
                char correctBracket = parans.get(leftBracket);

                if(current != correctBracket){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] arg){
        String input = "({}[])";

        System.out.println(input);
        boolean result = isValid(input);
        System.out.println("is valid: " + result);
    }
}
