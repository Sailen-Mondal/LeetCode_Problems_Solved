class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        if(s.length() != t.length())
                return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        //Putting elements of s - String into sMap
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0)+1);
        }

        //Putting elements of t into tMap
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            tMap.put(ch, tMap.getOrDefault(ch,0)+1);
        }


        return sMap.equals(tMap);
    }

}