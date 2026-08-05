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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = 1; i <= right - left; i++) {
            ListNode temp = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = temp;
        }
        return dummy.next;
    }
    // public ListNode reverseBetween(ListNode head, int left, int right) {
    //     if (head == null || left == right || right < left)
    //         return head;

    //     Stack<Integer> st = new Stack<>();
    //     ListNode curr = head;
    //     int i = 1;
    //     while (i <= right && curr != null) {
    //         if (i >= left) {
    //             st.push(curr.val);
    //         }
    //         curr = curr.next;
    //         i++;
    //     }

    //     int j = 1;
    //     ListNode node = head;
    //     while (j <= right && node != null) {
    //         if (j >= left && !st.isEmpty()) {
    //             node.val = st.pop();
    //         }
    //         node = node.next;
    //         j++;
    //     }
    //     return head;
    // }
}