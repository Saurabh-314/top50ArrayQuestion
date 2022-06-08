class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        int col=m-1,index=-1;
        
        for(int i=0;i<n;i++) {
            while(col>=0 && arr[i][col]==1) {
               col = col-1;
               index=i;
            }
        }
        return index;
    }
}