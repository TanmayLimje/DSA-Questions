// Given a string s, return true if the s can be palindrome after deleting at most one character from it. 

// Example 1:
// Input: s = "aba"
// Output: true
    
// Example 2:
// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.
    
// Example 3:
// Input: s = "abc"
// Output: false
    

public class Valid_palindrome {

    public static boolean validPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean validSubPalindrome(String s, int left, int right){
        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean almostPalindrome(String s){
        s =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return validSubPalindrome(s,left+1,right) || validSubPalindrome(s, left, right-1);
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(input);

        if(almostPalindrome(input)){
            System.out.println("Almost Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
