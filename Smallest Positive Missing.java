class Solution
{
    static int missingNumber(int arr[], int size)
    {
        for (int i = 0; i < size; i++) {
            while (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        
        return size + 1;
    }
}
