class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        int s = 0;
        for(int i=0;i<n-1;i++){
            sum +=array[i];
        }
        for(int i=1;i<=n;i++){
            s+=i;
        }
        return s - sum;
    }
}