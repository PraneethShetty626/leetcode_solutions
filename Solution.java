/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res= 0;

        for(int i = 31 ; i >= 0  ; i--) {
            if(((1<<i) & n) != 0) {
                res+=(1<<(31 - i));
            }
        }

        return res;
    }
}

// @lc code=end

