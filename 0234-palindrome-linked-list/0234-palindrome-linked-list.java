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
    ListNode curr = null;

    private boolean solve(ListNode head) {
        if (head == null) {
            return true;
        }

        boolean res = solve(head.next);

        if (curr.val != head.val) {
            return false;
        }

        curr = curr.next;

        return res;
    }

    public boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }
}