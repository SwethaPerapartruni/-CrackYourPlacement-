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
        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Find the node just before the start of the sublist to be reversed
        ListNode pre = dummy;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }

        // Start reversing the sublist
        ListNode current = pre.next;
        ListNode prev = null;
        ListNode next;
        for (int i = 0; i <= right - left; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Connect the reversed sublist back to the original list
        pre.next.next = current;
        pre.next = prev;

        return dummy.next;
    }
}
