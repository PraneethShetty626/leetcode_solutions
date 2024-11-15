/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        for(int i = 0; i < (1 << n) ; i++ ) {
            List<Integer> item = new ArrayList<>();
            for(int j = 0; j < n ; j++) {
                if((i & (1 << j)) != 0) {
                    item.add(nums[j]);
                }
            }

            res.add(item);
        }

        return res;
    }
}
// @lc code=end

