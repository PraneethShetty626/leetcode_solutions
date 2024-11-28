/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    List<List<Integer>> res= new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        traverseLevel(root, 0);

        List<List<Integer>> resReverse= new ArrayList<>();

        for(int j=res.size() -1; j >=0; j--){
            resReverse.add(res.get(j));
        }

        return resReverse;
    }

    public void traverseLevel(TreeNode root, int level){
        if(root == null) return;
    
        if (res.size() < level + 1) {
            res.add(new ArrayList<>());
        }
    
        res.get(level).add(root.val);
    
        traverseLevel(root.left, level+1);
        traverseLevel(root.right, level+1);
    }
}
// @lc code=end
