// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[] ans = new int[temperatures.length];
//         for (int i = 0; i < temperatures.length - 1; i++) {
//             int count = 0;
//             for (int j = i + 1; j < temperatures.length; j++) {
//                 count++;
//                 if (temperatures[j] > temperatures[i]) {
//                     ans[i] = count;
//                    break;
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}
