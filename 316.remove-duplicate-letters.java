/*
 * @lc app=leetcode id=316 lang=java
 *
 * [316] Remove Duplicate Letters
 *
 * https://leetcode.com/problems/remove-duplicate-letters/description/
 *
 * algorithms
 * Medium (50.54%)
 * Likes:    8894
 * Dislikes: 661
 * Total Accepted:    376.8K
 * Total Submissions: 737.6K
 * Testcase Example:  '"bcabc"'
 *
 * Given a string s, remove duplicate letters so that every letter appears once
 * and only once. You must make sure your result is the smallest in
 * lexicographical order among all possible results.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "bcabc"
 * Output: "abc"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "cbacdcbc"
 * Output: "acdb"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^4
 * s consists of lowercase English letters.
 * 
 * 
 * 
 * Note: This question is the same as 1081:
 * https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
 * 
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    PriorityQueue<String> res = new PriorityQueue<>();

    public String removeDuplicateLetters(String s) {
        getSuffix("", s, new HashMap<>());

        return res.peek();
    }

    public void getSuffix(String prefix, String suffix, Map<Character, Integer> map) {

        if (!res.isEmpty() && res.peek().compareTo(prefix) < 0)
            return;

        for (int i = 0; i < suffix.length(); i++) {

            if (map.containsKey(suffix.charAt(i))) {
                // contains element so needs to take two directions
                String replace = prefix.replace(suffix.charAt(i) + "", "") + suffix.charAt(i);

                getSuffix(replace, suffix.substring(i + 1), new HashMap<>(map));

            } else {
                map.put(suffix.charAt(i), null);
                prefix += suffix.charAt(i);
            }

        }

        res.add(prefix);
    }

}
// @lc code=end
