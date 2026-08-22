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
    int totalSum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return root;

        findSum(root);
        updateTree(root);

        return root;
    }

    void findSum(TreeNode root) {
        if (root == null)
            return;

        findSum(root.left);
        totalSum += root.val;
        findSum(root.right);
    }

    void updateTree(TreeNode root) {
        if (root == null)
            return;

        updateTree(root.left);
        int currSum = totalSum;
        totalSum -= root.val;
        root.val = currSum;
        updateTree(root.right);
    }
}