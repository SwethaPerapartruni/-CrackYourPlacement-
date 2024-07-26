// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

public class Solution {
public ListNode deleteDuplicates(ListNode head) {


// if (head == null) return null;
        
//         HashMap<Integer, Integer> countMap = new HashMap<>();
//         ListNode current = head;
        
//         while (current != null) {
//             countMap.put(current.val, countMap.getOrDefault(current.val, 0) + 1);
//             current = current.next;
//         }
//         ListNode dummy = new ListNode(0);
//         ListNode resultCurrent = dummy;
//         current = head;
        
//         while (current != null) {
//             if (countMap.get(current.val) == 1) {
//                 resultCurrent.next = new ListNode(current.val);
//                 resultCurrent = resultCurrent.next;
//             }
//             current = current.next;
//         }
        
//         return dummy.next;



    ListNode dummy = new ListNode(0), fast = head, slow = dummy;
    slow.next = fast;
    while(fast != null) {
    	while (fast.next != null && fast.val == fast.next.val) {
     		fast = fast.next;  
    	}
    	if (slow.next != fast) { 
    		slow.next = fast.next;
    		fast = slow.next;
    	} else { 
    		slow = slow.next;
    		fast = fast.next;
    	}
    	
    }
    return dummy.next;
} }
