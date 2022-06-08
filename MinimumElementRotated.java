class Solution
{
    int findMin(int arr[], int n)
    {
        int low=0;
        int high = n-1;
        while(low < high){
            int mid = low+((high-low)/2);
            if(arr[mid] < arr[high]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return arr[low];
    }
}