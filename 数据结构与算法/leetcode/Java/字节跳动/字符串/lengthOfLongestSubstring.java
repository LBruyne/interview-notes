import java.util.HashMap;

class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = -1;
        int maxLength = 0;
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(h.containsKey(s.charAt(i))) {
                left = h.get(s.charAt(i))+1 > left ? h.get(s.charAt(i))+1 : left;
                h.replace(s.charAt(i), i);
            }
            right++;
            h.put(s.charAt(i), i);
            maxLength = (right - left + 1 > maxLength ? right - left + 1 : maxLength);
        }
        return maxLength;
    }
}