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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        int length = 0;
        ListNode current1 = head;
        while (current1 != null) {
            length++;
            current1 = current1.next;
        }

        int[] l=new int[length];
        ListNode curr=head;
        int i=0;
        while(curr!=null){
            l[i++]=curr.val;
            curr=curr.next;
        }

        Arrays.sort(l);
        
        curr=head;
        int j=0;
        while(curr!=null){
            curr.val=l[j++];
            curr=curr.next;
        }
        return head;
    }
}
