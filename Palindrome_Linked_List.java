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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        int length = 0;
        ListNode current1 = head;
        while (current1 != null) {
            length++;
            current1 = current1.next;
        }


        int[] arr=new int[length];
        int i=0;
        ListNode current=head;
        while(current!=null){
            arr[i++]=current.val;
            current=current.next;
        }

        int j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]!=arr[k]){
                return false;
            }
            j++;
            k--;
        }
        return true;


        //another

        //  Stack<Integer> stack = new Stack();
        // ListNode curr = head;
        // while(curr != null) {
        //     stack.push(curr.val);
        //     curr = curr.next;
        // }
        // curr = head;
        // while(curr != null && curr.val == stack.pop()) {
        //     curr = curr.next;
        // }
        // return curr == null;
    }
}
