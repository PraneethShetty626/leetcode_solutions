/*
 * @lc app=leetcode id=684 lang=java
 *
 * [684] Redundant Connection
 *
 * https://leetcode.com/problems/redundant-connection/description/
 *
 * algorithms
 * Medium (63.83%)
 * Likes:    6890
 * Dislikes: 438
 * Total Accepted:    549.7K
 * Total Submissions: 827.6K
 * Testcase Example:  '[[1,2],[1,3],[2,3]]'
 *
 * In this problem, a tree is an undirected graph that is connected and has no
 * cycles.
 * 
 * You are given a graph that started as a tree with n nodes labeled from 1 to
 * n, with one additional edge added. The added edge has two different vertices
 * chosen from 1 to n, and was not an edge that already existed. The graph is
 * represented as an array edges of length n where edges[i] = [ai, bi]
 * indicates that there is an edge between nodes ai and bi in the graph.
 * 
 * Return an edge that can be removed so that the resulting graph is a tree of
 * n nodes. If there are multiple answers, return the answer that occurs last
 * in the input.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: edges = [[1,2],[1,3],[2,3]]
 * Output: [2,3]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
 * Output: [1,4]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == edges.length
 * 3 <= n <= 1000
 * edges[i].length == 2
 * 1 <= ai < bi <= edges.length
 * ai != bi
 * There are no repeated edges.
 * The given graph is connected.
 * 
 * 
 */

// @lc code=start

class Solution {

    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length + 1];

        for (int i = 1; i < edges.length + 1; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (find(parent, u) == find(parent, v)) {
                return edge;
            }

            union(parent, u, v);
        }

        return new int[2];

    }

    public int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }

        return parent[x];
    }

    public void union(int[] parent, int x, int y) {
        int rootx = find(parent, x);
        int rooty = find(parent, y);

        if (rootx != rooty) {
            parent[rooty] = rootx;
        }
    }

}
// @lc code=end
