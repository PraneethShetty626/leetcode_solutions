/*
 * @lc app=leetcode id=2575 lang=java
 *
 * [2575] Find the Divisibility Array of a String
 */

// @lc code=start
class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] res = new int[word.length()];

        long num = 0;

        for(int i = 0 ; i < word.length() ; i++) {
            
            num = ((num * 10) + (word.charAt(i) - 48)) % m;

            if(num == 0 ){
                res[i] = 1;
            }

        }

        return res;


    }
}
// @lc code=end

