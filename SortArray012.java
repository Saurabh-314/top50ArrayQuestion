class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zero = 0,one=0,two=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zero++;
            }
            else if(a[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        // System.out.println(zero+" "+one+" "+two);
        int x=0;
        
        for(int i=0;i<zero;i++){
            a[x++] = 0;
        }
        for(int i=0;i<one;i++){
            a[x++] = 1;
        }
        for(int i=0;i<two;i++){
            a[x++] = 2;
        }
    }
}