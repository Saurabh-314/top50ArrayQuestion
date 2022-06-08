class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        long max = 0;
       for(int i=0;i<n;i++){
           max = Math.max(a1[i],max);
           
       }
       
       int[] maxArray =new int[(int) max+1];
   if(m>n){
       return "No";
   }
   
   for(int i=0;i<n;i++){
       maxArray[(int) a1[i]]++;
   }
   for(int i=0;i<m;i++){
       if(maxArray[(int) a2[i]]==0){
           return "No";
       }
       
   }
   return "Yes";
    }
}