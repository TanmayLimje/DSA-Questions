/*
Given a string s of '(' , ')' and lowercase English characters.
Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
Formally, a parentheses string is valid if and only if:

1.It is the empty string, contains only lowercase characters, or
2.It can be written as AB (A concatenated with B), where A and B are valid strings, or
3.It can be written as (A), where A is a valid string.

Example 1:
Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
  
Example 2:
Input: s = "a)b(c)d"
Output: "ab(c)d"
  
Example 3:
Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
*/

import java.util.Stack;

public class Remove_min_parentheses {
    public static String minToRemoveToMakeValid(String s){
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder(s);

        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) == '('){
                stack.push(i);
            }
            else if(res.charAt(i) == ')' && !stack.isEmpty()){
                stack.pop();
            }
            else if (res.charAt(i) == ')') {
                res.setCharAt(i,'\0');
            }
        }

        while (!stack.isEmpty()){
            int index = stack.pop();
            res.setCharAt(index,'\0');
        }

        return res.toString().replace("\0","");

    }

    public static void main(String[] arg){
        String input = "a)(b(c)d(()";

        System.out.println(input);
        String result = minToRemoveToMakeValid(input);
        System.out.println("result : " + result);
    }
}
