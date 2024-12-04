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
