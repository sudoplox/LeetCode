328. Odd Even Linked List
https://leetcode.com/problems/odd-even-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return head;
        ListNode odd = head, even = head.next, evenHead = even; 

        while (even != null && even.next != null) {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead; 
        
        return head;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Odd Even Linked List.