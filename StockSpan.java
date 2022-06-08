class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int res[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
           if(s.isEmpty()){
               s.push(i);
           }
           else if(price[s.peek()]>=price[i]){
               s.push(i);
           }
           else{
               while(!s.isEmpty() && price[i]>price[s.peek()]){
                   int index=s.pop();
                   res[index]=index-i;
               }
               s.push(i);
           }
        }
        while(!s.isEmpty()){
           int index=s.pop();
           res[index]=index+1;
        }
        return res;
    }
    
}