public class Container_with_most_water {

    public static int brute(int [] nums){
        int maxArea = 0;
        //area =  length  * breadth
//        area = min(a,b) * (bi - ai)
        for(int a = 0; a < nums.length; a++){
            for(int b = a + 1; b < nums.length; b++){
                int area = Math.min(nums[a],nums[b]) * (b-a);
                maxArea = Math.max(maxArea,area);
            }
        }

        return maxArea;
    }

    public static int optimal(int [] nums){
        int p1 = 0;
        int p2 = nums.length - 1;
        int maxArea = 0;
        while (p1<p2){
            int h = Math.min(nums[p1], nums[p2]);
            int w = p2 - p1;
            int area = h * w;
            maxArea = Math.max(maxArea,area);
            if(nums[p1] <= nums[p2]){
                p1++;
            }
            else {
                p2--;
            }
        }
        return maxArea;
    }

    public static void main(String arg[]){
        int [] nums = new int[] {4,8,1,2,3,9};
        int maxArea = optimal(nums);

        System.out.println("Max area:" + maxArea);
    }

}
