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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int L = 1; //intial length
        ListNode tail = head;

        while (tail.next != null) {
            //determine actual length and tail
            tail = tail.next;
            L++;
        }

        // normalize k
        k = k % L;
        if (k == 0)
            return head;

        // connect tail to head, make list circular
        tail.next = head;

        // determine number nodes that does not need to be rotated
        int remain = L - k;
        ListNode newTail = head;
        for (int i = 1; i < remain; i++) {
            newTail = newTail.next;
        }

        // new tail.next is new head
        ListNode newHead = newTail.next;

        // new tail next = null
        newTail.next = null;

        return newHead;
    }
}