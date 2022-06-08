class Solution {
    public static void swap(int i, int j, int[] arr){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
    public static void convertToWave(int n, int[] a) {
        // code here
          for(int i = 0; i < n - 1; i+=2){
            swap(i, i + 1, a);
          }
    }
}