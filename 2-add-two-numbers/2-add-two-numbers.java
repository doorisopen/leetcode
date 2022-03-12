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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l1Values = new ArrayList<>();
        List<Integer> l2Values = new ArrayList<>();
        while (l1 != null) {
            l1Values.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            l2Values.add(l2.val);
            l2 = l2.next;
        }
        
        List<Integer> resultValue = calc(l1Values, l2Values);
        Collections.reverse(resultValue);

        ListNode currNode = null;
        for (int i = 0; i < resultValue.size(); i++) {
            int val = resultValue.get(i);
            if (currNode == null) {
                currNode = new ListNode(val);
            } else {
                ListNode nextNode = new ListNode(val, currNode);
                currNode = nextNode;
            }
        }
        return currNode;
    }
    
    private List<Integer> calc(List<Integer> list1, List<Integer> list2) {
        Collections.reverse(list1);
        Collections.reverse(list2);

        List<Integer> result = null;
        if (list1.size() < list2.size()) {
            return calcResult(list1, list2);
        }
        return calcResult(list2, list1);
    }
    
    private List<Integer> calcResult(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int add = 0;
        int list2EndIndex = list2.size() - 1;
        // list1 길이 만큼 덧셈 수행
        for (int i = list1.size() - 1; i >= 0; i--) {
            int sum = list2.get(list2EndIndex--) + list1.get(i) + add;
            add = sum / 10;
            result.add(sum % 10);
        }
        
        // list2 나머지 값 처리
        for (int i = list2EndIndex; i >= 0; i--) {
            int sum = list2.get(i) + add;
            add = sum / 10;
            result.add(sum % 10);
        }
        
        // 추가 값이 남은 경우 추가
        if (add > 0) {
            result.add(add);
        }
        return result;
    }
}