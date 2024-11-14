/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i + needle.length() <= haystack.length() ; i++) {
            if(haystack.substring(i, i + needle.length()).contentEquals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

