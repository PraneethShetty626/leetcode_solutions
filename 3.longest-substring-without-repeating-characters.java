/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        int max = 0 ;

        int i = 0 , j = 0;

        while (i < s.length() && j < s.length()) {
            if(map.containsKey(s.charAt(j))) {
                if((j - i) >= max) {
                    max = j-i;
                }
                i++;
                j=i;
                map.clear();
            }else {
                map.put(s.charAt(j), j);
                j++;
            }

            // additionla check 
        }

        if((j - i) >= max) {
            max = j-i;
        }

        return max;
    }
}
// @lc code=end

