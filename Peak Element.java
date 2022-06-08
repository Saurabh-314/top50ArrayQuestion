class PeakElement
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int l=0;
       int h=n-1;
       while(l<h){
           int mid = (l+h)/2;
           if(arr[mid] < arr[mid+1]){
               l=mid+1;
           }else{
               h = mid;
           }
       }
       return l;
    }
}