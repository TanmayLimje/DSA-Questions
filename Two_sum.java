import java.util.HashMap;

public class Two_sum {

    public static int[] two_sum_brute(int[] nums, int target){
        for(int p1 = 0; p1 < nums.length; p1++){
            int toFind = target - nums[p1];

            for(int p2 = p1+1; p2 < nums.length; p2++){
                if(toFind == nums[p2]){
                    return new int[] {p1,p2};
                }
            }
        }
        return null;
    }

    public static int[] two_sum_optimal(int [] nums, int target){
        HashMap<Integer,Integer> numsMap = new HashMap<>();

        for(int p = 0; p < nums.length; p++){
            if(numsMap.containsKey(nums[p])){
                return new int[] { numsMap.get(nums[p]),p };
            }
            else{
                int toFind = target - nums[p];
                numsMap.put(toFind,p);
            }
        }

        return null;
    }

    public static void main(String [] arg){
        int[] nums = new int[] {1,3,7,9,2};
        int target = 11;

        System.out.println("----------TWO SUM----------");
        System.out.println("input array");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        int[] result = two_sum_optimal(nums, target);

        if (result != null) {
            System.out.println("\nIndices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("\nNo solution found");
        }
    }

}
