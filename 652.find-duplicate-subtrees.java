/*
 * @lc app=leetcode id=652 lang=java
 *
 * [652] Find Duplicate Subtrees
 *
 * https://leetcode.com/problems/find-duplicate-subtrees/description/
 *
 * algorithms
 * Medium (59.84%)
 * Likes:    5975
 * Dislikes: 492
 * Total Accepted:    289.7K
 * Total Submissions: 482.8K
 * Testcase Example:  '[1,2,3,4,null,2,4,null,null,4]'
 *
 * Given the root of a binary tree, return all duplicate subtrees.
 * 
 * For each kind of duplicate subtrees, you only need to return the root node
 * of any one of them.
 * 
 * Two trees are duplicate if they have the same structure with the same node
 * values.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,2,3,4,null,2,4,null,null,4]
 * Output: [[2,4],[4]]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: root = [2,1,1]
 * Output: [[1]]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: root = [2,2,2,3,null,3,null]
 * Output: [[2,3],[3]]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of the nodes in the tree will be in the range [1, 5000]
 * -200 <= Node.val <= 200
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<String, Integer> map = new HashMap<>();

    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);

        return result;
    }

    public String dfs(TreeNode node) {
        if (node == null)
            return "";

        String left = dfs(node.left);
        String right = dfs(node.right);

        String string = String.valueOf(node.val);

        if (!left.isEmpty()) {
            string = left + "->" + string;
        }

        if (!right.isEmpty()) {
            string = string + "->" + string;
        }

        if (map.containsKey(string) && map.get(string) == 1) {
            result.add(node);
            map.put(string, map.get(string) + 1);

        } else {
            map.put(string, 1);
        }
        return string;

    }
}
// @lc code=end

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
