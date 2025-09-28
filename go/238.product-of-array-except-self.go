/*
 * @lc app=leetcode id=238 lang=golang
 *
 * [238] Product of Array Except Self
 *
 * https://leetcode.com/problems/product-of-array-except-self/description/
 *
 * algorithms
 * Medium (67.13%)
 * Likes:    24876
 * Dislikes: 1614
 * Total Accepted:    4M
 * Total Submissions: 5.8M
 * Testcase Example:  '[1,2,3,4]'
 *
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 *
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 *
 * 2 <= nums.length <= 10^5
 * -30 <= nums[i] <= 30
 * The input is generated such that answer[i] is guaranteed to fit in a 32-bit
 * integer.
 *
 *
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The
 * output array does not count as extra space for space complexity analysis.)
 *
 */

// @lc code=start

package main

func productExceptSelf(nums []int) []int {
	prefix := make([]int, len(nums))
	suffix := make([]int, len(nums))

	prefix[0] = 1
	suffix[len(nums)-1] = 1

	for i, j := 1, len(nums)-2; i < len(nums) && j > 0; {
		prefix[i] = prefix[i-1] * nums[i-1]
		suffix[j] = suffix[j+1] * nums[j+1]

		i++
		j--
	}

	res := make([]int, len(nums))

	for i := 0; i < len(nums); i++ {
		res[i] = suffix[i] * prefix[i]
	}

	return res

}

// @lc code=end
