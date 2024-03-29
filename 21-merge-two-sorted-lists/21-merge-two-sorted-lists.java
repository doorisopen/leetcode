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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1, list2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val == l2.val) {
            return new ListNode(l1.val, new ListNode(l2.val, merge(l1.next, l2.next)));
        } 
        if (l1.val < l2.val) {
            return new ListNode(l1.val, merge(l1.next, l2));
        }
        return new ListNode(l2.val, merge(l1, l2.next));
    }
}