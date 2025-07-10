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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode n = head.next; 
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode f = curr;
            ListNode s = curr.next;
            ListNode nextPair = s.next;

            
            s.next = f;
            f.next = nextPair;

            
            if (prev != null) {
                prev.next = s;
            }

            
            prev = f;
            curr = nextPair;
        }

        return n;
    }
    
}