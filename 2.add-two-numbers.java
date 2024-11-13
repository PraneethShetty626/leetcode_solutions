/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int reminder = l1.val + l2.val ;
        ListNode head = new ListNode(reminder % 10);

        head.next = addTwoNode(l1.next, l2.next, reminder / 10);

        return head;
    }

    public ListNode addTwoNode(ListNode l1, ListNode l2, int reminder ) {
        if(l1 == null && l2 == null && reminder == 0 ) {
            return null;
        }

        reminder+= (l1 != null ? l1.val :  0) + (l2 != null ? l2.val : 0);

        return  new ListNode(reminder % 10, addTwoNode(l1 == null ? null : l1.next , l2 == null ? null : l2.next, reminder / 10));
    }
}
// @lc code=end

