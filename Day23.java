// Question:
// Count Complete Tree Nodes
// .

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        // base case
        if (node.left == null && node.right == null)
            return 1;

        // recursion call
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}

// Better Solution, using tree properties
// class Solution {
// int height(TreeNode root) {
// if(root == null) return -1;

// return 1 + height(root.left);
// }
// public int countNodes(TreeNode root) {
// int h = height(root);

// if(h < 0) return 0;

// int rightHeight = height(root.right);
// if(rightHeight == h - 1) return (1 << h) + countNodes(root.right);
// else return (1 << (h - 1)) + countNodes(root.left);
// }
// }