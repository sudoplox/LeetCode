160. Intersection of Two Linked Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int sizeA = getSize(headA);
		int sizeB = getSize(headB);
		int count = 0;
		ListNode currentA = headA;
		ListNode currentB = headB;
		if (sizeA > sizeB) {
			count = sizeA - sizeB;
			while (count-- > 0)
				currentA = currentA.next;
		} else if (sizeB > sizeA) {
			count = sizeB - sizeA;
			while (count-- > 0)
				currentB = currentB.next;
		}
		while (currentA != null) {
			if (currentA == currentB)
				return currentA;
			currentA = currentA.next;
			currentB = currentB.next;
		}
		return null;
	}

	private int getSize(ListNode head) {
		int size = 0;
		ListNode current = head;
		while (current != null) {
			size++;
			current = current.next;
		}
		return size;
	}
}