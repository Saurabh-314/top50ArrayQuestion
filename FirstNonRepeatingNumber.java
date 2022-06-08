import java.util.HashMap;

public class FirstNonRepeatingNumber {
    public int firstNonRepeating(int arr[], int n) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hmap.containsKey(arr[i])){
                int temp = hmap.get(arr[i]);
                hmap.put(arr[i],++temp);
            }else{
                hmap.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            int t = hmap.get(arr[i]);
            if(t == 1){
                return arr[i];
            }
        }
        return -1;
    }
}
