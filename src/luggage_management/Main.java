package luggage_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] arg) {
        System.out.println (loadLuggage (10, 3));
        System.out.println (loadLuggage (15, 4));
        System.out.println (loadLuggage (17, 4));

    }

    public static List<Integer> loadLuggage (int n, int k) {
        int[] result = new int[k];
        int turn = 1;
        int slot = 0;

        while (n > 0) {
            int load = Math.min (turn, n);
            n -= load;
            result[slot] += load;

            turn++;
            slot = (slot + 1) % k;
        }

        List<Integer> finalResult = new ArrayList<>();
        for(int bag: result){
            finalResult.add (bag);
        }
        return finalResult;

    }
}
