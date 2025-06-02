package strings;

import java.util.HashMap;

public class Anagram {
    public static void main (String[] args) {
        String str1 = "listen";
        String str2 = "tanmay";

        if(anagram(str1,str2)){
            System.out.println ("anagram");
        }else{
            System.out.println ("not");
        }
    }

    public static boolean anagram(String str1, String str2){
        str1 = str1.toLowerCase ();
        str2 = str2.toLowerCase ();

        if(str1.length () != str2.length ()) return false;

        HashMap<Character,Integer> map = new HashMap<> ();

        for (char c: str1.toCharArray ()){
            map.put (c, map.getOrDefault (c,0)+1);
        }

        for (char c: str2.toCharArray ()){
            if(!map.containsKey (c)) return false;
            map.put (c, map.get(c)-1);
            if(map.get (c) == 0){
                map.remove (c);
            }
        }

        return map.isEmpty ();
    }
}
