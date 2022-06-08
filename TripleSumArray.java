class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        for(int i=0;i<n-2;i++) {
            int start=i+1;
            int end = n-1;
            while(start<end) {
                if(A[i]+A[start]+A[end]==X) {
                    return true;
                }
                else if(A[i]+A[start]+A[end]<X)
                    start++;
                else
                end--;
            }
        }
        return false;
    
    }
}
