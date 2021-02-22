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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slowPtr = head, quickPtr = head;
        while(quickPtr.next != null && quickPtr.next.next != null) {
            slowPtr = slowPtr.next;
            quickPtr = quickPtr.next.next;
        }
        
        ListNode mid = slowPtr.next;
        slowPtr.next = null;
        return merge(sortList(head), sortList(mid));
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode cur = new ListNode();
        ListNode res = cur;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
                cur = cur.next;
                l1 = l1.next;
            }
            else {
                cur.next = new ListNode(l2.val);
                cur = cur.next;
                l2 = l2.next;   
            }
        }
        if(l1 != null) {
            cur.next = l1;
        }
        if(l2 != null) {
            cur.next = l2;
        }
        return res.next;
    }
}