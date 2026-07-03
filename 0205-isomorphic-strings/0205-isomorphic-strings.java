class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> map1 = new HashMap<>();
        HashMap <Character, Character> map2 = new HashMap<>();
        //Base case
        if(s.length() != t.length())    return false;

        //For The String S
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i); 
            char charT = t.charAt(i); 

            if(map1.containsKey(charS) && (map1.get(charS)) != (t.charAt(i))){
                return false;
            }

            map1.put(charS, charT);
        }

        // For the String T
            for(int i = 0; i < t.length(); i++){
            char charS = s.charAt(i); 
            char charT = t.charAt(i); 

            if(map2.containsKey(charT) && (map2.get(charT)) != (s.charAt(i))){
                return false;
            }

            map2.put(charT, charS);
        }

        return true;
    }
}