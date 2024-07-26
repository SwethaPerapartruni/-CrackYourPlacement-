class Solution
{
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Step 1: Rearrange the array
        for (int i = 0; i < size; i++) {
            while (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        
        // Step 2: Find the smallest missing positive number
        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all numbers from 1 to size are present, return size + 1
        return size + 1;
    }
}
