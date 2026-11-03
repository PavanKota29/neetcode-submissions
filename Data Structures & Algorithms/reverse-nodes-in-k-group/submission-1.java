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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head;

        // Count the number of nodes in the list
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Reverse k nodes at a time
        while (count >= k) {
            curr = prev.next;
            ListNode nextNode = curr.next;

            // Reverse k nodes
            for (int i = 1; i < k; i++) {
                curr.next = nextNode.next;
                nextNode.next = prev.next;
                prev.next = nextNode;
                nextNode = curr.next;
            }

            prev = curr;
            count -= k;
        }

        return dummy.next;
    }
}
