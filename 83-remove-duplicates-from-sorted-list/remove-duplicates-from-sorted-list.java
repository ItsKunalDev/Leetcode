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
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode p= head;
        ListNode temp=head.next;
        while(temp!=null){
            if (temp.val==p.val){
                temp=temp.next;
                continue;
            }
            p.next=temp;
            p=temp;
            temp=temp.next;
        }
        p.next=null;
        return head; 
    }
}