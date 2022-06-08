import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};
        int n = arr.length;
        boolean flag =false;
        int sum=0;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(0);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(hs.contains(sum)){
                flag = true;
                break;

            }
            hs.add(sum);
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("false");
        }
    }
}
