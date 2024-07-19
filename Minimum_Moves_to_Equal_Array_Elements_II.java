class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int diff=0;
        int n=nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            diff+=Math.abs(nums[i]-n);
        }
        return diff;
    }
}
