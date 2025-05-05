/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 *
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/description/
 *
 * algorithms
 * Easy (56.99%)
 * Likes:    3994
 * Dislikes: 802
 * Total Accepted:    347.3K
 * Total Submissions: 605.3K
 * Testcase Example:  '[1,null,2,2]'
 *
 * Given the root of a binary search tree (BST) with duplicates, return all the
 * mode(s) (i.e., the most frequently occurred element) in it.
 * 
 * If the tree has more than one mode, return them in any order.
 * 
 * Assume a BST is defined as follows:
 * 
 * 
 * The left subtree of a node contains only nodes with keys less than or equal
 * to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or
 * equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,null,2,2]
 * Output: [2]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: root = [0]
 * Output: [0]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of nodes in the tree is in the range [1, 10^4].
 * -10^5 <= Node.val <= 10^5
 * 
 * 
 * 
 * Follow up: Could you do that without using any extra space? (Assume that the
 * implicit stack space incurred due to recursion does not count).
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bst.TreeNode;

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
    int max = 0;

    List<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        dfs(root, root);

        int[] ret = new int[res.size()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = res.get((ret.length - 1) - i);
        }

        return ret;

    }

    public int dfs(TreeNode root, TreeNode pNode) {
        if (root == null)
            return 0;

        int c;

        if (root.val == pNode.val) {
            c = 1 + dfs(root.left, root);
            dfs(root.right, root.right);
        } else {
            c = dfs(root.right, root.right);
            dfs(root.left, root.left);
        }

        if (c > max) {

            max = c;
            res.clear();
            res.add(root.val);
        } else if (c == max) {
            res.add(root.val);
        }

        return c;
    }

}

// @lc code=end
