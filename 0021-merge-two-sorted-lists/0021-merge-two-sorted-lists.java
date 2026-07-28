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
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }

        ListNode result;

        if (h1.val <= h2.val) {
            result = h1;
            result.next = mergeTwoLists(h1.next, h2);
        } else {
            result = h2;
            result.next = mergeTwoLists(h1, h2.next);
        }
        return result;
    }

}