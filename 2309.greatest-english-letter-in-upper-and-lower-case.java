/*
 * @lc app=leetcode id=2309 lang=java
 *
 * [2309] Greatest English Letter in Upper and Lower Case
 *
 * https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/description/
 *
 * algorithms
 * Easy (70.66%)
 * Likes:    500
 * Dislikes: 31
 * Total Accepted:    63.5K
 * Total Submissions: 89.5K
 * Testcase Example:  '"lEeTcOdE"'
 *
 * Given a string of English letters s, return the greatest English letter
 * which occurs as both a lowercase and uppercase letter in s. The returned
 * letter should be in uppercase. If no such letter exists, return an empty
 * string.
 * 
 * An English letter b is greater than another letter a if b appears after a in
 * the English alphabet.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "lEeTcOdE"
 * Output: "E"
 * Explanation:
 * The letter 'E' is the only letter to appear in both lower and upper case.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "arRAzFif"
 * Output: "R"
 * Explanation:
 * The letter 'R' is the greatest letter to appear in both lower and upper
 * case.
 * Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is
 * greater than 'F' or 'A'.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "AbCdEfGhIjK"
 * Output: ""
 * Explanation:
 * There is no letter that appears in both lower and upper case.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s consists of lowercase and uppercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String greatestLetter(String s) {
        char[] res = new char[26];

        char min = 64;

        for (char c : s.toCharArray()) {
            int index = c >= 97 ? c - 97 : c - 65;

            if (res[index] == 0) {
                res[index] = c;
            } else {
                if (res[index] != c) {
                    char newMin = res[index] >= 97 ? c : res[index];

                    if (newMin > min)
                        min = newMin;
                } else {
                    // no need
                }
            }
        }

        return min > 64 ? min + "" : "";

    }
}
// @lc code=end
