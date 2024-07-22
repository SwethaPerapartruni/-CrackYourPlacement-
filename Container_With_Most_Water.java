class Solution {
    public int maxArea(int[] height) {
        // int vol=0;
        // for(int i=0;i<height.length-1;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int area=Math.min(height[i],height[j]) * (j-i);
        //         vol=Math.max(vol,area);
        //     }
        // }
        // return vol;

        int l=0;
        int r=height.length-1;
        int vol=0;
        while(l<r){
            if(height[l]<height[r]){
                vol=Math.max(vol,height[l]*(r-l));
                l++;
            }else{
                vol=Math.max(vol,height[r]*(r-l));
                r--;
            }
        }
        return vol;
    }
}
