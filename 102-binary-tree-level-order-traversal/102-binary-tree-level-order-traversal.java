/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>qu = new LinkedList<>();
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>lvl = new ArrayList<>();
        
        if(root == null)return ans;
        
        qu.add(root);
        qu.add(null);
        
        while(!qu.isEmpty()){
             TreeNode rem = qu.remove(); 
             
            if(rem != null){            
                lvl.add(rem.val);
                if(rem.left != null){
                    qu.add(rem.left);
                }
                 if(rem.right != null){
                    qu.add(rem.right);
                }
            }else{
                ans.add(lvl);
               if(qu.size()>0) qu.add(null);
                lvl = new ArrayList<>();
            }
        }
        
        return ans;
    }
}