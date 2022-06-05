class SortArray {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low;j<=high-1;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    public static void QuickSort(int arr[],int l,int r){
        if(l<r){
            int pi = partition(arr,l,r);
            QuickSort(arr,l,pi-1);
            QuickSort(arr,pi+1,r);
        }
    }
    int[] sortArr(int[] arr, int n) { 
        // Arrays.sort(arr);
        QuickSort(arr,0,n-1);
        return arr;
    }
    
} 