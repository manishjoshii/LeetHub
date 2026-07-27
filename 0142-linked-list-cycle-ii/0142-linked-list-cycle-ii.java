/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    // brute force approach time = O(n) , space = O(n)
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (set.contains(head)) {
                return head;
            }
            set.add(head);
            head = head.next;
        }
        return head;
    }

    // optimal approach  Time: O(n) Space: O(1)
    // public ListNode detectCycle(ListNode head) {
    //     if (head == null || head.next == null)
    //         return null;

    //     ListNode slow = head.next;
    //     ListNode fast = head.next.next;

    //     while (slow.val != fast.val) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if (fast == null || slow == null)
    //             return null;
    //     }

    //     slow = head;
    //     while (slow.val != fast.val) {
    //         slow = slow.next;
    //         fast = fast.next;
    //     }

    //     return slow;
    // }
}