class Solution {
    public int firstUniqChar(String s) {

        //Method 1 : Using frequency Array
        /*
        int arr [] = new int[26];

        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
            int ctr = ch - 97;
            arr[ctr]++;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int ctr = ch - 97;
            if (arr[ctr] == 1)
                return s.indexOf(ch);
        }

    return -1;
    */

    //Method 2 : Using HashMaps
    HashMap<Character,Integer> map = new HashMap<>();

    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }

    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(map.get(ch) == 1)
            return i;
    }
        return -1;
    }
}