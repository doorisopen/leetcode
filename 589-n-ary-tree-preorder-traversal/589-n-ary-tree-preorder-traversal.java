/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private static List<Integer> result;
    
    public List<Integer> preorder(Node root) {
        result = new ArrayList<>();
        getPreorder(root);
        return result;
    }
    
    private void getPreorder(Node root) {
        if (root == null) return;
        result.add(root.val);
        if (root.children.size() > 0) {
            for (Node child : root.children) {
                getPreorder(child);
            }    
        }
        return;
    }
}