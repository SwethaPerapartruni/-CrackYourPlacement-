class Solution {
    public int majorityElement(int[] nums) {
       // Arrays.sort(nums);
       // return nums[nums.length/2];
        int b1=-1;
        int b2=0;
       for(int i=0;i<nums.length;i++){
        if(b2==0){
            b1=nums[i];
            b2++;
        }else if(nums[i]==b1){
            b2+=1;
        }else{
            b2-=1;
        }
       }
       return b1;
    }
}
