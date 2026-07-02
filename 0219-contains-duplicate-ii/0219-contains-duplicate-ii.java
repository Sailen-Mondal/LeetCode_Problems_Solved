class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Method 1: Brute force
        /*
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j] && (Math.abs(i-j) <= k)) return true;
            }
        }
        return false;
        */

        //Method 2: HashMap
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int ele = nums[i];
            if(map.containsKey(ele)){
                if(Math.abs(i - map.get(ele)) <= k)
                    return true;
            }
            map.put(ele,i);


        }
        return false;
    }
}