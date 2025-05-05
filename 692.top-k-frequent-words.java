/*
 * @lc app=leetcode id=692 lang=java
 *
 * [692] Top K Frequent Words
 *
 * https://leetcode.com/problems/top-k-frequent-words/description/
 *
 * algorithms
 * Medium (58.72%)
 * Likes:    7816
 * Dislikes: 362
 * Total Accepted:    692.4K
 * Total Submissions: 1.2M
 * Testcase Example:  '["i","love","leetcode","i","love","coding"]\n2'
 *
 * Given an array of strings words and an integer k, return the k most frequent
 * strings.
 * 
 * Return the answer sorted by the frequency from highest to lowest. Sort the
 * words with the same frequency by their lexicographical order.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["i","love","leetcode","i","love","coding"], k = 2
 * Output: ["i","love"]
 * Explanation: "i" and "love" are the two most frequent words.
 * Note that "i" comes before "love" due to a lower alphabetical order.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words =
 * ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
 * Output: ["the","is","sunny","day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent
 * words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 500
 * 1 <= words[i].length <= 10
 * words[i] consists of lowercase English letters.
 * k is in the range [1, The number of unique words[i]]
 * 
 * 
 * 
 * Follow-up: Could you solve it in O(n log(k)) time and O(n) extra space?
 * 
 */

// @lc code=start

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String string : words) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        PriorityQueue<Map<String, Integer>> queue = new PriorityQueue<>((map1, map2) -> {
            String key1 = map1.keySet().iterator().next();
            String key2 = map2.keySet().iterator().next();

            Integer value1 = map1.get(key1);
            Integer value2 = map2.get(key2);

            int keyCompare = Integer.compare(value1, value2); // ascending order of values if keys are equal

            if (keyCompare != 0) {
                return keyCompare;
            }

            return key2.compareTo(key1); // descending order of keys

        });

        for (String s : words) {
            Map<String, Integer> m = new HashMap<>();
            m.put(s, map.get(s));

            queue.add(m);
        }

        List<String> res = new ArrayList<>();

        while (k-- > 0 && !queue.isEmpty()) {
            Map<String, Integer> iteMap = queue.poll();

            res.add(iteMap.keySet().iterator().next());
        }

        return res;

    }
}
// @lc code=end
