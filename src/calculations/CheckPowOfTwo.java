package calculations;

public class CheckPowOfTwo {
    public static void main (String[] args) {
        int n = 16;
        System.out.println (n);
        if(powTwo(n)){
            System.out.println ("yes");
        }else {
            System.out.println ("no");
        }
    }

    public static boolean powTwo(int n){
        return n > 0 &&  (n&(n-1)) == 0;
    }
}
