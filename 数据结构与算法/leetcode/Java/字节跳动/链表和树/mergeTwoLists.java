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

 // recursion
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode res;
        if(l1.val < l2.val) {
            res = l1;
            res.next = mergeTwoLists(l1.next, l2);
        }
        else {
            res = l2;
            res.next = mergeTwoLists(l1, l2.next);
        }
        return res;
    }
}

// no-recursion
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode cur = new ListNode();
        ListNode res = cur;
        while(l1 != null && l2 != null) {
            ListNode next = new ListNode();
            if(l1.val < l2.val) {
                next.val = l1.val;
                l1 = l1.next;
            }
            else {
                next.val = l2.val;
                l2 = l2.next;
            }
            cur.next = next;
            cur = cur.next;
        }
        if(l1 != null) cur.next = l1;
        if(l2 != null) cur.next = l2;
        return res.next;
    }
}