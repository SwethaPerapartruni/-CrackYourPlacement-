/ class Solution 
// {
//     public int findPair(int n, int x, int[] arr) {
//       for(int i=0;i<arr.length-1;i++){
//           for(int j=i+1;j<arr.length;j++){
//               if(Math.abs(arr[j]-arr[i])==x){
//                   return 1;
//               }
//           }
//       }
//       return -1;
//     }
// }

class Solution {
    public int findPair(int n, int x, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (set.contains(num + x) || set.contains(num - x)) {
                return 1;
            }
            set.add(num);
        }
        
        return -1;
    }
}
