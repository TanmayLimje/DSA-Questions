public class Two_sum {

    public static int[] two_sum(int[] nums, int target){
        for(int p1 = 0; p1 < nums.length; p1++){
            int toFind = target - nums[p1];

            for(int p2 = p1+1; p2 < nums.length; p2++){
                if(toFind == nums[p2]){
                    return new int[] {p1,p2};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String [] arg){
        int[] nums = new int[] {1,7,11,15};
        int target = 9;

        System.out.println("----------TWO SUM----------");
        System.out.println("input array");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        int[] result = two_sum(nums, target);
        System.out.println("\nAnswer: " + result[0] + " " + result[1]);
    }

}
