// Question:
// Search in a Binary Search Tree
// .

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode searchBST(TreeNode node, int val) {
        // termination condition if not found or last node reached
        if (node == null || (node.left == null && node.right == null && node.val != val))
            return null;

        // terminating condition if value is found
        if (node.val == val)
            return node;

        // return a function call while moving down the tree
        if (node.val > val)
            return searchBST(node.left, val);

        return searchBST(node.right, val);
    }
}