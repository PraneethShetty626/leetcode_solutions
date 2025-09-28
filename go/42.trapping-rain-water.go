/*
 * @lc app=leetcode id=42 lang=golang
 *
 * [42] Trapping Rain Water
 *
 * https://leetcode.com/problems/trapping-rain-water/description/
 *
 * algorithms
 * Hard (63.77%)
 * Likes:    35061
 * Dislikes: 640
 * Total Accepted:    3.1M
 * Total Submissions: 4.7M
 * Testcase Example:  '[0,1,0,2,1,0,1,3,2,1,2,1]'
 *
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 *
 *
 * Example 1:
 *
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue
 * section) are being trapped.
 *
 *
 * Example 2:
 *
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *
 * n == height.length
 * 1 <= n <= 2 * 10^4
 * 0 <= height[i] <= 10^5
 *
 *
 */

// @lc code=start

package main

func trap(height []int) int {
	maxL := height[0]
	maxR := height[len(height)-1]

	i, j := 0, len(height)-1

	sum := 0

	for i <= j {
		if maxL <= maxR {
			sum += max(0, maxL-height[i])
			maxL = max(maxL, height[i])

			i++
		} else {
			sum += max(0, maxR-height[j])
			maxR = max(maxR, height[j])

			j--
		}
	}

	return sum
}

func max(a, b int) int {
	if a < b {
		return b
	}
	return a
}

// @lc code=end
