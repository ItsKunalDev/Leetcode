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
        if (head == null || k == 1) {
            return head;
        }
        ListNode d = new ListNode(0, head);
        ListNode g = d;
        while (true) {
            ListNode kth = g;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) {
                    return d.next;
                }
            }

            ListNode gn = kth.next;
            ListNode prev = gn;
            ListNode curr = g.next;
            while (curr != gn) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            ListNode temp = g.next;
            g.next = kth;
            g = temp;
        }

    }
}