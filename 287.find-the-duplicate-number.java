/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 *
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 *
 * algorithms
 * Medium (62.04%)
 * Likes:    24151
 * Dislikes: 5143
 * Total Accepted:    2.1M
 * Total Submissions: 3.4M
 * Testcase Example:  '[1,3,4,2,2]'
 *
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums, return this repeated number.
 * 
 * You must solve the problem without modifying the array nums and using only
 * constant extra space.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 10^5
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 * All the integers in nums appear only once except for precisely one integer
 * which appears two or more times.
 * 
 * 
 * 
 * Follow up:
 * 
 * 
 * How can we prove that at least one duplicate number must exist in nums?
 * Can you solve the problem in linear runtime complexity?
 * 
 * 
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    // brute force
    // public int findDuplicate(int[] nums) {
    // Arrays.sort(nums);

    // for (int i = 1; i < nums.length; i++) {
    // if (nums[i] == nums[i - 1]) {
    // return nums[i];
    // }
    // }

    // return -1;
    // }
    // Hashing
    // public int findDuplicate(int[] nums) {
    // int[] hash = new int[nums.length + 1];

    // for (int i : nums) {
    // if (hash[i] == 0) {
    // hash[i] = 1;
    // } else
    // return i;
    // }

    // return -1;
    // }

    // Linked list cycle method
    public int findDuplicate(int[] nums) {

        int track = nums[0];
        int fastTrack = nums[0];

        do {
            track = nums[track];
            fastTrack = nums[nums[fastTrack]];
        } while (track != fastTrack);

        fastTrack = nums[0];

        while (track != fastTrack) {
            track = nums[track];
            fastTrack = nums[fastTrack];
        }

        return track;

    }
}
// @lc code=end
