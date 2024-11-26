/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    
    List<String> res= new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        String path = "";

        binaryTreePaths(root,path);

        return res;
    }

    public void binaryTreePaths(TreeNode root, String path) {
        if(root == null) return;

        path+=root.val;
        
        if(root.left == null && root.right == null) {
            res.add(path);
        }

        binaryTreePaths(root.left,path + "->");
        binaryTreePaths(root.right,path + "->");
    }
}
// @lc code=end

