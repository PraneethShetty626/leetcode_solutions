/*
 * @lc app=leetcode id=347 lang=java
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

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Node> queue = new PriorityQueue<>((arg0, arg1) -> Integer.compare(arg1.value, arg0.value));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            queue.add(new Node(i, map.get(i)));
        }

        int[] res = new int[k];

        int i = 0;

        while (k-- > 0 && !queue.isEmpty()) {
            res[i++] = queue.poll().key;
        }

        return res;
    }
}

class Node {
    int key;
    int value;

    Node(int k, int v) {
        key = k;
        value = v;
    }
}
// @lc code=end
