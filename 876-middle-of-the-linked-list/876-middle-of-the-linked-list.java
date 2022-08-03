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
    public ListNode middleNode(ListNode head) {
        ListNode end = head;
        int size = 0;
        while (end != null) {
            ++size;
            end = end.next;
        }
        
        if (head == null) return null;
        int middlePos = (size / 2);
        for (int i = 0; i < middlePos; i++) {
            head = head.next;
        }
        return head;
    }
}