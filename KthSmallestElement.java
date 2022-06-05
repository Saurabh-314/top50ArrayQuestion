import java.util.Arrays;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {  
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String args[]){
        int arr[] = {1,4,7,8,4,5,2,3,5,7,8,4,9,5,6,2,3,4,1};
        int k = 3;
        int n = arr.length;
        kthSmallest(arr,0,n,k);
    }
}
