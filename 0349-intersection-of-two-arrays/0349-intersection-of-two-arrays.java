class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for(int x : nums1){
            set1.add(x);
        }
        
        for(int x : nums2){
            if(set1.contains(x)){
                res.add(x);
            }

        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int x : res){
            result[i] = x;
            i++;
        }

        return result;
    }
}