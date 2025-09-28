/*
 * @lc app=leetcode id=49 lang=golang
 *
 * [49] Group Anagrams
 *
 * https://leetcode.com/problems/group-anagrams/description/
 *
 * algorithms
 * Medium (69.97%)
 * Likes:    21161
 * Dislikes: 724
 * Total Accepted:    4.1M
 * Total Submissions: 5.8M
 * Testcase Example:  '["eat","tea","tan","ate","nat","bat"]'
 *
 * Given an array of strings strs, group the anagrams together. You can return
 * the answer in any order.
 *
 *
 * Example 1:
 *
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 *
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Explanation:
 *
 *
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form
 * each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged
 * to form each other.
 *
 *
 *
 * Example 2:
 *
 *
 * Input: strs = [""]
 *
 * Output: [[""]]
 *
 *
 * Example 3:
 *
 *
 * Input: strs = ["a"]
 *
 * Output: [["a"]]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 <= strs.length <= 10^4
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 *
 *
 */

package main

// @lc code=start
// func groupAnagrams(strs []string) [][]string {
// 	mp := make(map[string][]string)

// 	for _, str := range strs {
// 		runes := []rune(str)

// 		sort.Slice(runes, func(i, j int) bool { return runes[i] < runes[j] })

// 		mp[string(runes)] = append(mp[string(runes)], str)
// 	}

// 	res := make([][]string, len(mp))

// 	for _, val := range mp {
// 		res = append(res, val)
// 	}

// 	return res

// }

func groupAnagrams(strs []string) [][]string {
	mp := make(map[[26]int][]string)

	for _, str := range strs {
		var count [26]int
		for _, r := range str {
			count[r-'a']++
		}

		mp[count] = append(mp[count], str)
	}

	res := make([][]string, 0)

	for _, val := range mp {
		res = append(res, val)
	}

	return res
}

// @lc code=end
