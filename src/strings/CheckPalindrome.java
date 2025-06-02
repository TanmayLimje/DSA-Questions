package strings;

public class CheckPalindrome {
    public static void main (String[] args) {
        String str = "tent";
        System.out.println (str);
        boolean isPalindrome = checkPalindrome (str);

        if (isPalindrome) {
            System.out.println ("Palindrome");
        } else {
            System.out.println ("Not a palindrome");
        }
    }

    public static boolean checkPalindrome (String str) {
        str = str.replace ("\\s+", "").toLowerCase ();

        int left = 0;
        int right = str.length ()-1;

        while (left < right){
            if (str.charAt (left) != str.charAt (right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
