//void rearrange(int arr[], int n) {
//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        int i,j;
//        for(i = 0; i < n ; i++)
//        {
//            if(arr[i] >= 0)
//            pos.add(arr[i]);
//            else
//            neg.add(arr[i]);
//        }
//        i = 0;
//        int n1 = pos.size(), n2 = neg.size();
//        int c1 = 0, c2 = 0;
//        while(i< n)
//        {
//            if(c1 < n1)
//            arr[i++] = pos.get(c1++);
//            if(c2 < n2)
//            arr[i++] = neg.get(c2++);
//        }
//
//    }