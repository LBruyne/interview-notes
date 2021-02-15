import java.util.LinkedList;

class Solution {
    public String simplifyPath(String path) {
        String res = "";
        String[] files = path.split("/+");

        LinkedList<String> stack = new LinkedList<String>();
        for(int i = 0; i < files.length; i++) {
            if(files[i].equals(".") || files[i].equals("")) continue;
            else if(files[i].equals("..")) {
                if(stack.size() == 0) continue;
                else stack.removeLast();
            }
            else {
                stack.addLast(files[i]);
            }
        }
        
        if(stack.size() == 0) return "/";
        
        for(int i = 0; i < stack.size(); i++)
            res += ("/" + stack.get(i));

        return res;
    }
}