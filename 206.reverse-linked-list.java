/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /**
  * Given the head of a singly linked list, reverse the list, and return the reversed list.
  */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public ListNode reverse(ListNode head, ListNode prev) {

            if(head == null) {
                return prev;
            }

            ListNode temp  = prev ;
            ListNode next = head.next;

            head.next = temp;

        
            return reverse(next, head);
        
    }
}
// @lc code=end

