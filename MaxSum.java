class GfG {
    int max_sum(int A[], int n) {
    
    int sum=0,temp=0,ans=0;
    
       for(int i=0;i<n;i++){
           sum+=A[i];
           temp+=A[i]*i;
       }
       ans=temp;
       for(int i=0;i<n;i++){
          temp=temp+sum-n*A[n-1-i];
          ans=Math.max(temp,ans);
       }
       return ans;
    }	
}
