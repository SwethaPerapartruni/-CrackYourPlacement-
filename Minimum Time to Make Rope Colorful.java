class Solution {
    public int minCost(String colors, int[] neededTime) {
//         int count = 0;
//         for (int i = 0; i < colors.length() - 1; i++) {
//             if (colors.charAt(i) == colors.charAt(i + 1)) {
//                 if (neededTime[i] > neededTime[i + 1]) {
//                     count += neededTime[i + 1];
//                      neededTime[i + 1] = neededTime[i]; 
//                 } else {
//                     count += neededTime[i];
//                     neededTime[i] = neededTime[i + 1]; 
//                 }
//             }
//         }
//         return count;

        int n = colors.length();
        int result = 0;
        for (int i=1; i<n; i++) {
            if (colors.charAt(i) == colors.charAt(i-1)) {
                result = result + Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
        }
        return result;
    }
}
