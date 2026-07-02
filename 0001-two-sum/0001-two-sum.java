class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Method: Using HashMaps
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int reqElement = target - nums[i];

            //if required element is present return the index of the pair else add the element to the HashMaps
            if(map.containsKey(reqElement)){
                int j = map.get(reqElement);
                return new int[] {j,i};
            }

            map.put(nums[i],i);
        }
        //Edge case: Never gonna occure
        return new int[] {-1,-1};
    }
}