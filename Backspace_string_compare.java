// Backspace String Compare

// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.

// Example 1:
// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".

// Example 2:
// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".

// Example 3:
// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".


import java.sql.SQLOutput;
import java.util.ArrayList;

public class Typed_out_Strings {

    public static ArrayList<Character> buildArrayList(String s){
        ArrayList<Character> buildString = new ArrayList<>();

        for (char c: s.toCharArray()){
            if(c != '#'){
                buildString.add(c);
            }
            else{
                if(!buildString.isEmpty()){
                    buildString.remove(buildString.size()-1);
                }
            }
        }
        return buildString;
    }

    public static boolean compare(String s, String t){
        ArrayList<Character> finalS = buildArrayList(s);
        ArrayList<Character> finalT = buildArrayList(t);

        System.out.println("\nFinal s = " + finalS + "\nFinal t = " + finalT);

        if(finalS.size() != finalT.size()){
            return false;
        }
        else{
            for(int i = 0; i < finalS.size(); i++){
                if(finalS.get(i) != finalT.get(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean optimal(String s, String t){
        int p1 = s.length()-1;
        int p2 = t.length()-1;

        while(p1 >= 0 || p2 >= 0){
            if(p1 >= 0 && s.charAt(p1) == '#' || p2 >= 0 && t.charAt(p2) == '#'){
                if(p1 >= 0 && s.charAt(p1)=='#'){
                    int backCount = 2;
                    while(p1 >= 0 && backCount > 0){
                        p1--;
                        backCount--;
                        if(p1 >= 0 && s.charAt(p1) == '#'){
                            backCount = backCount + 2;
                        }

                    }
                }
                if(p2 >= 0 &&t.charAt(p2) == '#'){
                    int backCount = 2;
                    while(p2 >= 0 && backCount > 0){
                        p2--;
                        backCount--;
                        if(p2 >= 0 && t.charAt(p2) == '#'){
                            backCount = backCount + 2;
                        }
                    }
                }
            }
            else {
                if (p1 >= 0 && p2 >= 0) {
                    if (s.charAt(p1) != t.charAt(p2)) {
                        return false;
                    }
                } else if (p1 >= 0 || p2 >= 0) {
                    return false;
                }
                p1--;
                p2--;
            }
        }
        return true;
    }


    public static void main(String arg[]){
        String s = "ab###c";
        String t = "a#c";

        System.out.println("s= " + s + "\nt= " + t);


        if(optimal(s,t)){
            System.out.println("\nEqual");
        }
        else {
            System.out.println("\nNot Equal");
        }
    }
}
