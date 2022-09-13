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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        return merge(root1, root2);
    }
    
    private TreeNode merge(TreeNode node1, TreeNode node2) {
        TreeNode root = null;
        if (node1 != null && node2 != null) {
            root = new TreeNode(node1.val + node2.val);
            root.left = merge(node1.left, node2.left);
            root.right = merge(node1.right, node2.right);
        } else if (node1 != null && node2 == null) {
            root = new TreeNode(node1.val);
            root.left = merge(node1.left, null);
            root.right = merge(node1.right, null);
        } else if (node1 == null && node2 != null) {
            root = new TreeNode(node2.val);
            root.left = merge(null, node2.left);
            root.right = merge(null, node2.right);
        } else {
            return null;
        }
        return root;
    }
}