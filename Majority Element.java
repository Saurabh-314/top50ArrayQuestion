class Solution
{
    static int majorityElement(int a[], int size)
    {
         int y=0;
       int l =-1;
       int n=size;
       int t=0;
       int w=n/2;
       Arrays.sort(a);
   int count = 0;
       if (n==1){
           l=a[0];
           return l;
           }
           
     for(int i=0;i<n-1;i++){
          if(a[i]==a[i+1]){
             count++;
             y=i;
            }
            else{ t=count+1;
                if(t>w){
                    l=a[y];
                    count=0;
                }else {
                    count=0;
                    }
                }
     }
     if(count+1>w){
         l=a[y];
     }
       return l;
    }
}