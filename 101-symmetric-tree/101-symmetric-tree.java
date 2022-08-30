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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;
        if (root.left.val != root.right.val) return false;
        return isSubSymmetric(root.left, root.right);
    }
    
    public boolean isSubSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.left != null && right.right != null) {
            if (left.left.val != right.right.val) {
                return false;
            }
        }
        if (left.right != null && right.left != null) {
            if (left.right.val != right.left.val) {
                return false;
            }
        }
        return isSubSymmetric(left.left, right.right) && isSubSymmetric(left.right, right.left);
    }
}