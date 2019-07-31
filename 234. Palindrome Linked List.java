234. Palindrome Linked List
https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {val = x; }
 * }
 */
class Solution {
    private ListNode findMid(ListNode head) {
    ListNode fast = head.next;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow;
}

private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
        ListNode tmp = head.next;
        head.next = prev;
        prev = head;
        head = tmp;
    }
    return prev;
}


public boolean isPalindrome(ListNode head) {
    if (head == null) {
        return true;
    }
    ListNode mid = findMid(head);
    ListNode second = mid.next;
    
    ListNode first = head;
    second = reverse(second);
    while (first != null && second != null) {
        if (first.val != second.val) {
            return false;
        }
        first = first.next;
        second = second.next;
    }
    return true;
}
}