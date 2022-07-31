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
    public ListNode deleteDuplicates(ListNode head) {
        boolean[] visit = new boolean[201];
        ListNode curr = head;
        if (curr == null) return curr;
        visit[curr.val + 100] = true;
        while (curr.next != null) {
            if (visit[curr.next.val + 100]) {
                curr.next = curr.next.next;
            } else {
                visit[curr.next.val + 100] = true;
                curr = curr.next;
            }
        }
        return head;
    }
}