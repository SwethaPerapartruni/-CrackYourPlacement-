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
    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null) return true;
        boolean left = hasPathSum(root.left, target);
        boolean right = hasPathSum(root.right, target);
        return (left || right);
    }
}
