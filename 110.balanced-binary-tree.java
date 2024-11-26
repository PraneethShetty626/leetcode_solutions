/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = height(root.left);
        int right= height(root.right);

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(right - left) <= 1;
    }

    public int height(TreeNode node){
        if(node == null) return 0;
        else return 1 + Math.max(height(node.left), height(node.right));
    }

}
// @lc code=end

