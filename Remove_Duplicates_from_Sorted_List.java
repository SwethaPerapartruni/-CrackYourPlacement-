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
        if(head==null){
            return null;
        }
        ListNode current=head;
        HashSet<Integer> set1=new HashSet<>();
        set1.add(current.val);
        while(current.next!=null){
           if(set1.contains(current.next.val)){
            current.next=current.next.next;
           }else{
             set1.add(current.next.val);
             current=current.next;
           }
        }
        return head;
    }
}
