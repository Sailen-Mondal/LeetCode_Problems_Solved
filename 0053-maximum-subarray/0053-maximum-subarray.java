class Solution {
    public int maxSubArray(int[] nums) {

        /*
        //brute-force Approach
        int max = nums[0];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                sum += nums[j];

                if(sum > max)
                    max = sum;
            }
            sum = 0;
        }
        return max;
        */

        //Optimal Approach
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(sum > max)
                max = sum;

            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}