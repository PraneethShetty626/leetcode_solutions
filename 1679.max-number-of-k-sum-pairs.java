/*
 * @lc app=leetcode id=1679 lang=java
 *
 * [1679] Max Number of K-Sum Pairs
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int c = 0;

        for(int i=0; i < nums.length ; i++){
            if(map.containsKey(i)) continue ;

            for(int j =  i + 1; j < nums.length ; j++){
                if(map.containsKey(j)) continue ;

                if(nums[i] + nums[j] == k){
                    map.put(i,nums[i]);
                    map.put(j, nums[j]);
                    c++;
                    break;
                }
            }
        }

        return c;
    }
}
// @lc code=end

