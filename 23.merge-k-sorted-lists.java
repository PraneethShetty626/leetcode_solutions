/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length < 1) return null;

        ListNode head = lists[0];

        for(int i = 1 ; i < lists.length ; i++){
            head = mergeTwoLists(head,lists[i]);
        }

        return head;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if( list1 == null && list2 == null) {
            return null;
        }
        
        ListNode head = new ListNode();
        
        if(list1 == null) {
            head.val = list2.val;
            head.next = mergeTwoLists(list1, list2.next);
        }
        else if(list2 == null) {
            head.val = list1.val;
            head.next = mergeTwoLists(list1.next, list2);
        }
        else {
            if(list1.val <= list2.val) {
                head.val = list1.val;
                head.next = mergeTwoLists(list1.next, list2);
            }
            else {
                head.val = list2.val;
                head.next = mergeTwoLists(list1, list2.next);
            }
        }

        return head;

    }
    
}
// @lc code=end

