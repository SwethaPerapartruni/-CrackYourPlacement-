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
    public ListNode mergeKLists(ListNode[] lists) {
        // if(lists.length == 0){
        //     return null;
        // }
        // for(int i = 1;i<lists.length;i++){
        //     ListNode c1 = lists[0];
        //     ListNode c2 = lists[i];
        //     ListNode ans = new ListNode(-1);
        //     ListNode c3 = ans;
        //     while(c1!=null && c2!=null){
        //         if(c1.val<c2.val){
        //             c3.next = c1;
        //             c1= c1.next;
        //             c3 = c3.next;
        //         }
        //         else{
        //             c3.next = c2;
        //             c2 = c2.next;
        //             c3=c3.next;
        //         }
        //     }
        //     if(c1==null){
        //         c3.next = c2;
        //     }
        //     else{
        //         c3.next = c1;
        //     }

        //     lists[0]=ans.next;
        // }
        // return lists[0];

if(lists.length==0) return null;
    PriorityQueue<Integer> pq=new PriorityQueue<>();

    for(int i=0;i<lists.length;i++){
        ListNode curr=lists[i];
        while(curr!=null){
            pq.add(curr.val);
            curr=curr.next;
        }
    }

    ListNode ans=new ListNode(-1);
    ListNode curr=ans;
    while(!pq.isEmpty()){
        int curr2=pq.poll();
        ListNode curr3=new ListNode(curr2);
        curr.next=curr3;
        curr=curr.next;
    }
    return ans.next;
    }
}
