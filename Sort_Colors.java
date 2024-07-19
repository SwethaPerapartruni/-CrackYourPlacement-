class Solution {
    public void sortColors(int[] nums) {
        int [] arr = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==2){
                arr[r]=nums[i];
                r--;
            }
            else if( nums[i]==0) {
                arr[l] = nums[i];
                l++;
            } else continue;
        }
        while(l<=r){
            arr[l]=1;
            l++;
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}
