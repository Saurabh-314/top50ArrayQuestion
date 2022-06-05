class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer>output = new ArrayList<Integer>();
        int duplicate = 0;
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                duplicate = 1;
                m.put(arr[i],m.get(arr[i]+1));
            }else{
                m.put(arr[i],1);
            }
        }
        if(duplicate == 1){
            for(Map.Entry<Integer,Integer>map:m.entrySet()){
                if(map.getValue()>=2){
                    output.add(map.getKey());
                }
            }
        }else{
            output.add(-1);
        }
        Collections.sort(output);
        return output;
    }
}