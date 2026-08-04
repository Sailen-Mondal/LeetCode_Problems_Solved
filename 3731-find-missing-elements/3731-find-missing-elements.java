class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        Arrays.sort(nums);

        int start = nums[0];
        int end = nums[nums.length-1];

        for(int i = start; i <= end; i++){
            //element not present
            if(nums[index] != i){
                list.add(i);

            }else{
                index++;
            }

        }
        return list;
    }
}