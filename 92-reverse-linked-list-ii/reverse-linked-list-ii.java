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
        if(head==null||head.next==null){
            return head;
        }
        ListNode d=new ListNode(0);
        d.next=head;

        ListNode pre=d;
        ListNode curr=head;
        for (int i=0; i<left-1;i++){
            pre=pre.next;
            curr=curr.next;

        }

        ListNode sub= curr;
        ListNode prev=null;
        for(int i=0; i<=right-left;i++){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        pre.next=prev;
        sub.next=curr;
        return d.next;
    }
}