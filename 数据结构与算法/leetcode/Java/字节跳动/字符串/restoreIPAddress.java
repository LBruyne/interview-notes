import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int p1, p2, p3;
        for(p1 = 1; p1 < s.length() && p1 < 4; p1++) {
            String s1 = s.substring(0, p1);
            if(!isValidSeg(s1)) continue; 
            for(p2 = p1 + 1; p2 < s.length() && p2 < p1 + 4; p2++) {
                String s2 = s.substring(p1, p2);
                if(!isValidSeg(s2)) continue; 
                for(p3 = p2 + 1; p3 < s.length() && p3 < p2 + 4; p3++) {
                    String s3 = s.substring(p2, p3);
                    if(!isValidSeg(s3)) continue; 
                    String s4 = s.substring(p3, s.length());
                    if(!isValidSeg(s4)) continue; 
                    res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                }
            }
        }
        return res;
    }

    private boolean isValidSeg(String str) {
        if(str.length() == 0 || str.length() > 3) return false;
        if(str.length() > 1 && str.charAt(0) == '0') return false;
        if(Integer.parseInt(str) > 255 || Integer.parseInt(str) < 0) return false;
        return true;
    }  
}