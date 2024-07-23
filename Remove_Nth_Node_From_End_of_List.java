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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }

        if(head!=null && head.next==null && n==1){
            return null;
        }
        if(len-n==0){
                return head.next;
        }
        else if(len-n==1){
            if(n==1){
                 head.next=null;
                return head;
            }
        }
        curr=head;
        for(int i=1;i<len-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
