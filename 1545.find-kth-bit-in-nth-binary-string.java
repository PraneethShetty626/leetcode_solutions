/*
 * @lc app=leetcode id=1545 lang=java
 *
 * [1545] Find Kth Bit in Nth Binary String
 *
 * https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
 *
 * algorithms
 * Medium (70.25%)
 * Likes:    1471
 * Dislikes: 95
 * Total Accepted:    159.8K
 * Total Submissions: 227.7K
 * Testcase Example:  '3\n1'
 *
 * Given two positive integers n and k, the binary string Sn is formed as
 * follows:
 * 
 * 
 * S1 = "0"
 * Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
 * 
 * 
 * Where + denotes the concatenation operation, reverse(x) returns the reversed
 * string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1
 * changes to 0).
 * 
 * For example, the first four strings in the above sequence are:
 * 
 * 
 * S1 = "0"
 * S2 = "011"
 * S3 = "0111001"
 * S4 = "011100110110001"
 * 
 * 
 * Return the k^th bit in Sn. It is guaranteed that k is valid for the given
 * n.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 3, k = 1
 * Output: "0"
 * Explanation: S3 is "0111001".
 * The 1^st bit is "0".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 4, k = 11
 * Output: "1"
 * Explanation: S4 is "011100110110001".
 * The 11^th bit is "1".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 20
 * 1 <= k <= 2^n - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public char findKthBit(int n, int k) {
        String res = getString(n);

        return res.charAt(k);

    }

    public String getString(int n) {
        if (n == 1)
            return "0";

        String last = getString(n - 1);

        return last + "1" + invertReverse(last);
    }

    public String invertReverse(String s) {
        String res = "";

        for (char c : s.toCharArray()) {
            if (c == '0') {
                res = "1" + res;
            } else {
                res = "0" + res;
            }
        }
        return res;
    }
}
// @lc code=end
