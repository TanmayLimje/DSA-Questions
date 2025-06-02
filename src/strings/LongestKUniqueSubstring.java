package strings;

import java.util.HashMap;

public class LongestKUniqueSubstring {
    public static void main (String[] args) {
        String str = "aaabbccd";
        int k = 2;
        System.out.println (str);

        String result = longestKUniqueSubstring (str, k);
        System.out.println (result);
    }

    public static String longestKUniqueSubstring (String str, int k) {
        if (str == null || str.length () == 0 || k == 0) return "";

        HashMap<Character, Integer> charCount = new HashMap<> ();

        int left = 0, right = 0;
        int maxLen = 0, startIndex = 0;

        while (right < str.length ()) {
            char c = str.charAt (right);
            charCount.put (c, charCount.getOrDefault (c, 0) + 1);
            right++;

            while (charCount.size () > k) {
                char leftChar = str.charAt (left);
                charCount.put (leftChar, charCount.get (leftChar) - 1);
                if(charCount.get (leftChar) == 0){
                    charCount.remove (leftChar);
                }
                left++;
            }

            if(charCount.size () == k && (right-left) > maxLen){
                maxLen = right-left;
                startIndex = left;
            }
        }

        return maxLen == 0 ? "" : str.substring (startIndex,startIndex+maxLen);
    }
}
