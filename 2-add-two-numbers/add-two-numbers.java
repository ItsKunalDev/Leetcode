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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(0);
        ListNode p= r;
        int curr=0;
        while(l1!=null || l2!=null){
            int sum=0+curr;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            curr=sum/10;
            sum=sum%10;
            p.next=new ListNode(sum);
            p=p.next;
        }
        if(curr==1){
            p.next=new ListNode(1);
        }
        return r.next;
        
    }
}