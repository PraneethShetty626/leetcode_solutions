/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start


class Solution {
    public String longestPalindrome(String s) {
        int i =0;
        int j= s.length() - 1;

        String res = "";

        while (i <= j) {
            if(s.charAt(i) == s.charAt(j)) {
        
                if(isPallindrome(s.substring(i, j+1)) && s.substring(i, j+1).length() > res.length()) {
                    res = s.substring(i, j+1);
                    i++;
                    j= s.length() - 1;
                }
                else {
                    j--;
                }
            }
            else {
                j--;
            }

            if(i==j) {
                i++;
                j=s.length() - 1;
            }
            
        }

        return res;
    }

    boolean isPallindrome(String s) {
        for(int i = 0 , j = s.length() - 1 ; i <= j ; i++,j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
// @lc code=end

