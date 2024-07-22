public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (sum % k == 0) {
        //             count++;
        //         }
        //     }
        // }
        // return count;


        // int arr[] = new int[k];
        // int sum = 0;
        // int count = 0;
        // arr[0] = 1;
        // for(int i : nums) {
        //     sum = (i+sum)%k;
        //     if(sum < 0) sum += k;
        //     count += arr[sum];
        //     arr[sum]++;
        // }
        // return count;


        int[] prearr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            prearr[i]=sum;
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(prearr[i]%k+k)%k;
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                ans+=h.get(arr[i]);
                h.put(arr[i], h.get(arr[i]) + 1);
            }else{
                h.put(arr[i],1);
            }
        }
        return ans;
    }
}
