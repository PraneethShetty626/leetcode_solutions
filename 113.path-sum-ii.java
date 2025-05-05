/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 *
 * https://leetcode.com/problems/path-sum-ii/description/
 *
 * algorithms
 * Medium (59.74%)
 * Likes:    8271
 * Dislikes: 161
 * Total Accepted:    1M
 * Total Submissions: 1.7M
 * Testcase Example:  '[5,4,8,11,null,13,4,7,2,null,null,5,1]\n22'
 *
 * Given the root of a binary tree and an integer targetSum, return all
 * root-to-leaf paths where the sum of the node values in the path equals
 * targetSum. Each path should be returned as a list of the node values, not
 * node references.
 * 
 * A root-to-leaf path is a path starting from the root and ending at any leaf
 * node. A leaf is a node with no children.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: [[5,4,11,2],[5,8,4,5]]
 * Explanation: There are two paths whose sum equals targetSum:
 * 5 + 4 + 11 + 2 = 22
 * 5 + 8 + 4 + 5 = 22
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: root = [1,2,3], targetSum = 5
 * Output: []
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: root = [1,2], targetSum = 0
 * Output: []
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, 0, new ArrayList<>());
        return res;
    }

    public void dfs(TreeNode root, int targetSum, int csum, List<Integer> list) {
        if (root == null)
            return;

        csum = csum + root.val;

        list.add(root.val);

        if (targetSum == csum) {
            if (root.left == null && root.right == null) {
                res.add(list);
            } else {
                // non root node
            }
        } else {
            dfs(root.left, targetSum, csum, new ArrayList<>(list));
            dfs(root.right, targetSum, csum, new ArrayList<>(list));
        }
    }
}
// @lc code=end
