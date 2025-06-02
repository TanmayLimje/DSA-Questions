package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main (String[] args) {
        String str = "AAa";
        System.out.println (str);

        char result = firstNonRepeatingChar(str);

        if (result!=0){
            System.out.println (result);
        }else {
            System.out.println ("none");
        }
    }

    public static char firstNonRepeatingChar(String str){
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<> ();

        for (char c : str.toCharArray ()){
            countMap.put (c, countMap.getOrDefault (c,0) + 1);
        }

        for (Map.Entry<Character,Integer> entry : countMap.entrySet ()){
            if(entry.getValue () == 1){
                return entry.getKey ();
            }
        }

        return 0;
    }
}
