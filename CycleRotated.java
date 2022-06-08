class CycleRotated {
    
    public void rotate(int arr[], int n)
    {
        int temp = arr[n-1]; // 5
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1]; // 12345-> 1234
        }
        arr[0] = temp;
    }
}