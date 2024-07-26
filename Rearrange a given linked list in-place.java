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
    public void reorderList(ListNode head) {
          if (head == null || head.next == null) {
            return;
        }


        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }

        curr=head;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=curr.val;
            curr=curr.next;
        }


        curr=head;
        int i=0;
        int j=len-1;
        while(i<j){
            curr.val=arr[i];
            curr=curr.next;
            curr.val=arr[j];
            curr=curr.next;
            i++;
            j--;
        }
        if(i==j){
            curr.val=arr[i];
        }
    }
}
