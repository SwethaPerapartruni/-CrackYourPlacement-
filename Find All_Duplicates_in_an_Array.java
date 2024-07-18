class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         ArrayList<Integer> ans = new ArrayList<>();
         int j=0;
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                ans.add(nums[i]);
                j++;
            }else{
                set.add(nums[i]);
            }
         }
         return ans;
    }
}

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//          int a[]=new int[nums.length+1];
//         ArrayList<Integer> al=new ArrayList<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             a[nums[i]]++;
//         }
//         for(int i=1;i<a.length;i++)
//         {
//             if(a[i]>1)
//             {
//                 al.add(i);
//             }
//         }
//         return al;
//     }
// }
