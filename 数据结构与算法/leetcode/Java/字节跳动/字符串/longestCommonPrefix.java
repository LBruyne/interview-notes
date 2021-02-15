class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        if(strs.length != 0) {
            commonPrefix = strs[0];
            for(int i = 0; i < strs.length; i++) {
                int minLength = commonPrefix.length() < strs[i].length() ? commonPrefix.length() : strs[i].length();
                int end;
                
                for(end = 0; end < minLength; end++) {
                    if(commonPrefix.charAt(end) != strs[i].charAt(end)) break;
                }
                commonPrefix = commonPrefix.substring(0, end);
            }            
        } 
        return commonPrefix;
    }
}