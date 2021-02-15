class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] sArr = s.split("\\s+");
        String res = "";
        for(int i = sArr.length - 1; i >= 0; i--) {
            res += (sArr[i] + " ");
        }
        return res.trim();
    }
}