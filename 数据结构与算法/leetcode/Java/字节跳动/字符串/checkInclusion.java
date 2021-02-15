import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> s1HashMap = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++) {
            if (s1HashMap.containsKey(s1.charAt(i))) {
                s1HashMap.replace(s1.charAt(i), s1HashMap.get(s1.charAt(i))+1);
            }
            else {
                s1HashMap.put(s1.charAt(i), 1);
            }
        }
        
        Boolean res = false;
        for(int i = 0; i < s2.length()-s1.length()+1; i++) {
            String subStr = s2.substring(i, i + s1.length());
            HashMap<Character, Integer> subStrHashMap = new HashMap<Character, Integer>();
            for(int j = 0; j < subStr.length(); j++) {
                if (subStrHashMap.containsKey(subStr.charAt(j))) {
                    subStrHashMap.replace(subStr.charAt(j), subStrHashMap.get(subStr.charAt(j))+1);
                }
                else {
                    subStrHashMap.put(subStr.charAt(j), 1);
                }
            }
            if(s1HashMap.equals(subStrHashMap)) {
                res = true;
                break;
            }
        }

    }
}