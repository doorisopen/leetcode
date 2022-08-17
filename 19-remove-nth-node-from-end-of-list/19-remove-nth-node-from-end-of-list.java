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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) return null;
        // reverse
        ListNode rear = head;
        ListNode reveseHead = null;
        while (rear != null) {
            ListNode next = rear.next;
            rear.next = reveseHead;
            reveseHead = rear;
            rear = next;
        }
        
        // delete & reverse
        ListNode front = reveseHead;
        ListNode frontHead = null;
        while (front != null) {
            --n;
            if (n == 0) {
                if (front.next == null) {
                    return frontHead;
                }
                front = front.next;                
            }
            ListNode next = front.next;
            front.next = frontHead;
            frontHead = front;
            front = next;
        }
        
        return frontHead;
    }
}