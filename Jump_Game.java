// class Solution {
//     public boolean canJump(int[] nums) {
//         int farthest = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (i > farthest) {
//                 return false; 
//             }
//             farthest = Math.max(farthest, i + nums[i]);
//         }
//         return farthest >= nums.length - 1;
//     }
// }
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;        
    }
}
