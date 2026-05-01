// Floor
  
int floor(int[] arr, int target) {
    int start = 0, end = arr.length - 1;
    int ans = -1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] <= target) {
            ans = arr[mid];   // store value
            start = mid + 1;  // go right
        } else {
            end = mid - 1;
        }
    }
    return ans;
}
