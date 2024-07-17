class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int x, y;
        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }
        // return new int[] {};

        HashMap<Integer,Integer> map1=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map1.containsKey(complement)){
                return new int[]{map1.get(complement),i};
            }
            map1.put(nums[i],i);
         }
         return new int[]{};
    }
}
