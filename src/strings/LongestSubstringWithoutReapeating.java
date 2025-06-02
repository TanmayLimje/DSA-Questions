package strings;

import java.util.HashMap;

public class LongestSubstringWithoutReapeating {
    public static void main (String[] args) {
        String str = "abceabcc";
        int len = longestSubstring(str);
        System.out.println (str);
        System.out.println (len);
    }

    public static int longestSubstring(String string){
        if(string == null || string.isEmpty ()) return 0;

        HashMap<Character, Integer> map = new HashMap<> ();
        int maxLen = 0;
        int start = 0;

        for ( int end = 0; end < string.length (); end++){
            char currentChar = string.charAt (end);

            if(map.containsKey (currentChar) && map.get (currentChar) >= start){
                start = map.get (currentChar) + 1;
            }

            map.put (currentChar,end);
            maxLen = Math.max (maxLen, end-start+1);
        }
        return maxLen;
    }
}
