import java.util.*;

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        
        int[] res = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >= 0; i--) {
            int appendix = 0, base = 0;
            int sum = 0;
            for(int j = num2.length() - 1; j >= 0; j--) {
                sum = (num1.charAt(i)- '0') * (num2.charAt(j) - '0');
                res[j + i + 1] += sum;
                res[j + i] += res[j + i + 1] / 10;
                res[j + i + 1] %= 10;
            }
        }
        
        int start = 0;
        while(res[start] == 0) 
            start++;

        StringBuilder sb = new StringBuilder();
        for(int i = start; i < res.length; i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}