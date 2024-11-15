/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0 ; 
       int j = 0;
       int c = 0 ;
       int[] res = new int[nums1.length + nums2.length];

       while (i < nums1.length && j < nums2.length) {
           if(nums1[i] < nums2[j]) {
               res[c++] = nums1[i++];
           }
           else {
               res[c++] = nums2[j++];
           }
       }

       while (i < nums1.length) {
           res[c++] = nums1[i++];
       }

       while (j < nums2.length) {
           res[c++] = nums2[j++];
       }

       if((i+j) % 2 == 0) {
           return (float)(res[(i+j) / 2] + res[((i+j) / 2) - 1]) /2;
       }
       else {
           return  (float)res[(i+j) / 2];
       }
   }
}
// @lc code=end

