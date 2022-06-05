import java.util.*;

class ReverseArray {
	public static void main (String[] args) {
		//code 4321
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int j=0;j<n;j++){
		        a[j] = sc.nextInt();
		    }
		    for(int k=0,l=n-1;k<l;k++,l--){
		        int temp = a[k];
		        a[k] = a[l];
		        a[l] = temp;
		    }
		    for(int x=0;x<n;x++){
		        System.out.print(a[x]+" ");
		    }
		    System.out.println();
		}
        sc.close();
	}
}