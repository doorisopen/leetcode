/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        connectByRight(root.left, root.right);
        return root;
    }
    
    private void connectByRight(Node left, Node right) {
        if (left.next == null) {
            left.next = right;
        }
        if (left.left != null) {
            connectByRight(left.left, left.right);
            connectByRight(left.right, right.left);
            connectByRight(right.left, right.right);   
        }
    }
}