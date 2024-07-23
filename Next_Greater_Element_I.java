class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i=nums2.length-1;i>=0;i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nextGreaterMap.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }
        
        return result;



        // int[] result = new int[nums1.length];
        
        // for (int i = 0; i < nums1.length; i++) {
        //     boolean found = false;
        //     result[i] = -1; 
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j]) {
        //             for (int k = j + 1; k < nums2.length; k++) {
        //                 if (nums2[k] > nums1[i]) {
        //                     result[i] = nums2[k];
        //                     found = true;
        //                     break;
        //                 }
        //             }
        //             if (!found) {
        //                 result[i] = -1; 
        //             }
        //             break; 
        //         }
        //     }
        // }     
        // return result;
    }
}
