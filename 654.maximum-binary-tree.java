/*
 * @lc app=leetcode id=654 lang=java
 *
 * [654] Maximum Binary Tree
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int index = getIndex(nums, 0, nums.length - 1);
        TreeNode rooNode = new TreeNode(nums[index]);

        rooNode.left = buildTree(nums, 0, index - 1);
        rooNode.right = buildTree(nums, index  + 1, nums.length - 1);

        return rooNode;

    }

    public int getIndex(int[] nums, int start, int end){
        int max = Integer.MIN_VALUE;
        int index = start;

        while (start <= end) {

            if(nums[start] > max){
                max = nums[start];
                index = start;
            }

            start++;
        }

        return index;
    }


    public TreeNode buildTree(int[] nums, int start, int end){
        if(start <= end){
            int index = getIndex(nums, start, end);
            TreeNode rooNode = new TreeNode(nums[index]);
    
            rooNode.left = buildTree(nums, start, index - 1);
            rooNode.right = buildTree(nums, index  + 1, end);

            return rooNode;
        }
        else {
            return null;
        }
    }
}
// @lc code=end

