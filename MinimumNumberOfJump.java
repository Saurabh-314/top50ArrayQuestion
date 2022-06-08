class Solution{
    static int minJumps(int[] arr){
        // your code here
        int i=0,maxy=0,end=0,jump=0,n=arr.length;
        while(i<(n-1)) {
            maxy=Math.max(maxy,i+arr[i]);
            if(i==end)
            {
               jump++;
               end=maxy;
            }
            i++;
        
            
        }
        if(end<n-1)
        {
            return -1;
        }
        return jump;
    }
}