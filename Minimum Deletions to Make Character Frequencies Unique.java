class Solution {
    public int minDeletions(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            arr[c-'a']++;
        }

        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=25;i>=0;i--){
            if(arr[i]==0){
                break;
            }
            while(arr[i]>0 && set.contains(arr[i])){
                arr[i]--;
                count++;
            }
            
                set.add(arr[i]);
            
        }
        return count;
    }
}
