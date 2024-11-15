/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {
    public int hammingWeight(int n) {
            int c = 0;
            int i = 0;
            
            while ((1 << i) <= n && (1 << i) >= 0) {
                if(((1 << i) & n) != 0) c++;
                i++; 
            }

            return c;
        }
}
// @lc code=end

