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
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        
        int v1 = (t1 != null) ? t1.val : 0;
        int v2 = (t2 != null) ? t2.val : 0;
        
        TreeNode root = new TreeNode(v1 + v2);
        
        root.left = mergeTrees((t1 != null) ? t1.left : null, (t2 != null) ? t2.left : null);
        root.right = mergeTrees((t1 != null) ? t1.right : null, (t2 != null) ? t2.right : null);
        
        return root;
    }
}
