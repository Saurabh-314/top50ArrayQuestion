public class QuickSort {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[], int low,int high){
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
    static void sort(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,8,7,2,3,4,6,9,5,0};
        int n = arr.length;

        sort(arr,0,n-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
