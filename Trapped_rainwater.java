public class Trapped_rainwater {

    public static int brute(int[] arr){
        int totalWater = 0;

        for(int p = 0; p < arr.length; p++){
            int leftP = p;
            int rightP = p;
            int maxL = 0;
            int maxR = 0;

            while(leftP >= 0){
                maxL = Math.max(maxL,arr[leftP]);
                leftP--;
            }
            while (rightP < arr.length){
                maxR = Math.max(maxR,arr[rightP]);
                rightP++;
            }

            int currentWater = Math.min(maxL,maxR) -arr[p];

            if(currentWater >= 0){
                totalWater += currentWater;
            }
        }
        return totalWater;
    }

    public static int optimal(int[] arr){
        int totalWater = 0;
        int left = 0;
        int right = arr.length-1;
        int maxLeft = 0;
        int maxRight = 0;

        while (left < right){
            if(arr[left] <= arr[right]){
                if (arr[left] >= maxLeft){
                    maxLeft = arr[left];
                }
                else{
                    totalWater += maxLeft - arr[left];
                }
                left++;
            }
            else {
                if(arr[right] >= maxRight){
                    maxRight = arr[right];
                }
                else {
                    totalWater += maxRight - arr[right];
                }
                right--;
            }
        }


        return totalWater;
    }

    public static void main(String arg[]){
        int[] arr = new int[] {0,1,0,2,1,0,3,1,0,1,2};
        System.out.println("Trapped rainwater");
        int totalWater = optimal(arr);
        System.out.println("Total water: " + totalWater);
    }

}
