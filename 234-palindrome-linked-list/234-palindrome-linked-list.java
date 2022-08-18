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
    public boolean isPalindrome(ListNode head) {
        ListNode reverseHead = null;
        
        ListNode front = new ListNode();
        ListNode temp = front;
        ListNode rear = head;
        while (rear != null) {
            temp.next = new ListNode(rear.val, rear.next);
            temp = temp.next;
            
            ListNode next = rear.next;
            rear.next = reverseHead;
            reverseHead = rear;
            rear = next;
        }
        
        front = front.next;
        while (front != null) {
            if (front.val != reverseHead.val) {
                return false;
            }
            front = front.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }
    
    private void print(ListNode head) {
        System.out.print("\n");
        while (head != null) {
            System.out.print(head.val + ",");
            head = head.next;
        }
        System.out.print("\n");
    }
}