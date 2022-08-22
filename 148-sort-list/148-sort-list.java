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
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(slow);
        
        return sort(h1, h2);
    }
    
    
    private ListNode sort(ListNode h1, ListNode h2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (h1 != null && h2 != null) {
            if (h1.val > h2.val) {
                curr.next = h2;
                h2 = h2.next;
            } else {
                curr.next = h1;
                h1 = h1.next;
            }
            curr = curr.next;
        }
        
        if (h1 != null) {
            curr.next = h1;
        }
        
        if (h2 != null) {
            curr.next = h2;
        }
        return head.next;
    }
}