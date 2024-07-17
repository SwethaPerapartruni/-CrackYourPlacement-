class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0;i<nums1.length;i++){
        //     nums1[m+i]=nums2[i];
        // } 
        // Arrays.sort(nums1);

        int r=n-1;
        int l=m-1;
        int pos=nums1.length-1;
        while(l>=0 && r>=0){
            if(nums1[l]>nums2[r]){
                nums1[pos]=nums1[l];
                pos--;
                l--;
            }else{
                nums1[pos]=nums2[r];
                pos--;
                r--;
            }
        }
        while(pos>=0 && r>=0){
            nums1[pos]=nums2[r];
            pos--;
            r--;
        }
    }
}
