class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr=new int[26];
        for(char c:tasks){
            arr[c-'A']++;
        }

        Arrays.sort(arr);
        int max=arr[25]-1;
        int idle=max*n;

        for(int i=24;i>=0;i--){
            idle = idle - Math.min(max,arr[i]);
        }
        return idle>0?idle+tasks.length:tasks.length;
    }
}
