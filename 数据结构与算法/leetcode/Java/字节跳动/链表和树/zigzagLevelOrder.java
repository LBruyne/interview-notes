/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean flag = false;
        
        int size;
        while(queue.size() != 0) {  
            List<Integer> level = new ArrayList<Integer>();
            size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.removeFirst();
                if(cur.left != null) queue.addLast(cur.left);
                if(cur.right != null) queue.addLast(cur.right);
                
                if(!flag) level.add(cur.val); 
                else level.add(0, cur.val);
            }
            flag = !flag;
            res.add(level);
        }
        
        return res;
    }
}