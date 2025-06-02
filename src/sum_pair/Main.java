package sum_pair;

import java.util.*;

public class Main {
    public static void main (String[] arg) {
        System.out.println (findPair (new int[]{1, 2, 3, 4, 5}));
    }

    public static List<List<Integer>> findPair (int[] arr) {

        Map<Integer, int[]> sumMap = new HashMap<> ();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];

                if(sumMap.containsKey (sum)){
                    int [] prev = sumMap.get (sum);
                    if(prev[0] != i && prev[0] != j && prev[1] != i && prev[1] != j){
                        return Arrays.asList (
                                Arrays.asList (prev[0],prev[1]), Arrays.asList (i,j)
                        );
                    }
                }else {
                    sumMap.put (sum, new int[]{i,j});
                }
            }
        }


        return new ArrayList<> ();
    }
}
