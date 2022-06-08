class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {    
        long max = Integer.MIN_VALUE;
        long product = 1;
        for(int i=0;i<n;i++){
            product *= arr[i];
            max = Math.max(max,product);
            if(product == 0)
                product=1;
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            product *= arr[i];
            max = Math.max(product,max);
            if(product == 0)
                product=1;
        }
        return max;
    }
}