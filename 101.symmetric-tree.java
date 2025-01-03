/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isChildMirror(root.left, root.right);
    }

    public boolean isChildMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        else if(left == null || right == null) {
            return false;
        }
        else {
            return left.val == right.val && isChildMirror(left.left, right.right) && isChildMirror(left.right, right.left);
        }

    }
}
// @lc code=end

