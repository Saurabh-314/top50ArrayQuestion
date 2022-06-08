class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
       
       // Your code here
        int left = 0, right = n - 1;
        long lmax = Long.MIN_VALUE, rmax = Long.MIN_VALUE;
        long res = 0;
        
        while(left < right) {
            lmax = Math.max(lmax, arr[left]);
            rmax = Math.max(rmax, arr[right]);
            
            if(lmax < rmax) {
                res = res + (lmax - arr[left++]);
            } else {
                res = res + (rmax - arr[right--]);
            }
        }
        
        return res;
        
    } 
}