/*
 * @lc app=leetcode id=242 lang=golang
 *
 * [242] Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (65.81%)
 * Likes:    13564
 * Dislikes: 456
 * Total Accepted:    5.3M
 * Total Submissions: 7.9M
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 *
 *
 * Example 1:
 *
 *
 * Input: s = "anagram", t = "nagaram"
 *
 * Output: true
 *
 *
 * Example 2:
 *
 *
 * Input: s = "rat", t = "car"
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 <= s.length, t.length <= 5 * 10^4
 * s and t consist of lowercase English letters.
 *
 *
 *
 * Follow up: What if the inputs contain Unicode characters? How would you
 * adapt your solution to such a case?
 *
 */

// @lc code=start

package main

func isAnagram(s string, t string) bool {
	mp := make(map[rune]int)

	for _, r := range s {
		mp[r]++
	}

	for _, r := range t {
		mp[r]--

		if mp[r] == 0 {
			delete(mp, r)
		}
	}

	return len(mp) == 0

}

// @lc code=end
