// Given a string s, find the length of the longest substring without repeating characters. 

// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
    
// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
    
// Example 3:
// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.



import java.util.HashMap;
import java.util.HashSet;

public class Longest_substring {

    public static int longestSubstringBrute(String s){
        if(s.length() <= 1) return s.length();

        int longest = 0;

        for(int left = 0; left < s.length(); left++){
            HashSet<Character> seen = new HashSet<>();
            int currentLength = 0;

            for(int right = left; right < s.length(); right++){
                char currentChar = s.charAt(right);
                if(!seen.contains(currentChar)){
                    currentLength+=1;
                    seen.add(currentChar);
                    longest = Math.max(currentLength,longest);
                }
                else {
                    break;
                }
            }
        }


        return longest;
    }


    public static int longestSubstringOptimal(String s){
        if(s.length() <= 1) return s.length();

        int longest = 0;
        HashMap<Character, Integer> seen = new HashMap<>();
        int left = 0;

        for(Integer right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            Integer prevSeenChar = seen.get(currentChar);

            if(prevSeenChar != null && prevSeenChar >= left){
                left = prevSeenChar + 1;
            }
            seen.put(currentChar,right);

            longest = Math.max(longest,right-left+1);
        }

        return longest;
    }

    public static void main(String arg[]){
        String a = "abcadbc";
        int result = longestSubstringOptimal(a);
        System.out.println("String: " + a);
        System.out.println("Longest substring: " + result);
    }

}
