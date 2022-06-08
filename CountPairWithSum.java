import java.util.HashMap;

class CountPairWithSum {
   int getPairsCount(int[] arr, int n, int k) {
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       for(int i=0; i<n; i++){
           if(!hm.containsKey(arr[i])){
               hm.put(arr[i],0);
           }
           hm.put(arr[i],hm.get(arr[i])+1);
       }
       int count=0;
       for(int i=0; i<n; i++){
           if(hm.get(k-arr[i])!=null){
               count=count+hm.get(k-arr[i]);
           }
           
           if(k-arr[i]==arr[i]){
               count--;
           }
           
       }return count/2;
       
   }

}