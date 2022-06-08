class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class FindMinMax {
    static pair getMinMax(long a[], long n) {
        long min =a[0];
        long max =0;
        
        for(int i=0;i<n;i++){
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
        pair np = new pair(min,max);
        return np;
    }
    public static void main(String args[]){
        long arr[] = {1,2,4,7,8,5,3,6,9};
        long n = arr.length;

//        Compute obj = new Compute();

        pair product = getMinMax(arr,n);
        
        System.out.println(product.first+" "+product.second);


    }
}


