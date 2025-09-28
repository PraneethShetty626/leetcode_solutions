/*
 * @lc app=leetcode id=347 lang=golang
 *
 * [347] Top K Frequent Elements
 *
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 *
 * algorithms
 * Medium (63.78%)
 * Likes:    18188
 * Dislikes: 720
 * Total Accepted:    2.8M
 * Total Submissions: 4.3M
 * Testcase Example:  '[1,1,1,2,2,3]\n2'
 *
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order.
 *
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 *
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n),
 * where n is the array's size.
 *
 */

// @lc code=start

package main

// func topKFrequent(nums []int, k int) []int {
// 	mp := make(map[int]int)

// 	for _, v := range nums {
// 		mp[v]++
// 	}

// 	keys := make([]int, 0)

// 	for key := range mp {
// 		keys = append(keys, key)
// 	}

// 	sort.Slice(keys, func(i, j int) bool { return mp[keys[i]] > mp[keys[j]] })

// 	res := make([]int, 0)

// 	for _, val := range keys {
// 		res = append(res, val)

// 		if len(res) == k {
// 			break
// 		}
// 	}

// 	return res
// }

// Bukcet sort technique
func topKFrequent(nums []int, k int) []int {
	mp := make(map[int]int)

	for _, v := range nums {
		mp[v]++
	}

	bucket := make([][]int, len(nums))

	for key, val := range mp {
		bucket[val] = append(bucket[val], key)
	}

	res := make([]int, 0)

	for _, val := range bucket {
		res = append(val, res...)
	}

	return res[:k]
}

// @lc code=end
