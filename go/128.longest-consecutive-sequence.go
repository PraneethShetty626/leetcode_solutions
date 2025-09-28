/*
 * @lc app=leetcode id=128 lang=golang
 *
 * [128] Longest Consecutive Sequence
 *
 * https://leetcode.com/problems/longest-consecutive-sequence/description/
 *
 * algorithms
 * Medium (47.65%)
 * Likes:    22050
 * Dislikes: 1196
 * Total Accepted:    2.9M
 * Total Submissions: 6.1M
 * Testcase Example:  '[100,4,200,1,3,2]'
 *
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 * Example 1:
 *
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 *
 *
 * Example 2:
 *
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 *
 * Example 3:
 *
 *
 * Input: nums = [1,0,1,2]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 *
 *
 */

// @lc code=start

package main

func longestConsecutive(nums []int) int {
	mp := make(map[int]bool)

	for _, val := range nums {
		mp[val] = true
	}

	max := 0

	for _, val := range nums {
		if mp[val-1] {
			continue
		}

		// get the length

		length := 0

		for mp[val] {
			length++
			val++
		}

		if length > max {
			max = length
		}
	}

	return max
}

// @lc code=end
