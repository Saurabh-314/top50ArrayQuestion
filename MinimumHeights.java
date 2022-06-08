class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        if(n == 1) return 0;
       
       Arrays.sort(arr);
       
       int min_res = arr[0];
       int max_res = arr[n-1];
       int diff = max_res - min_res; 
       
       for(int i=1; i<n; i++){
           
           if(arr[i] - k < 0) continue;
           
           min_res = Math.min(arr[0] + k, arr[i] - k);
           max_res = Math.max(arr[i-1] + k, arr[n-1] - k);
           
           diff = Math.min(diff, max_res - min_res);
       }
       
       return diff;
    }
}