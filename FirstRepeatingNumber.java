import java.util.HashMap;

public class FirstRepeatingNumber {

    public static int firstRepeated(int[] arr, int n) {
        // Your code here
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
            if(t != 1){
                return i+1;
            }
        }
        return -1;
    }
}
