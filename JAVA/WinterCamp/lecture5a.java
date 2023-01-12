package WinterCamp;

public class lecture5a {
	public static void main(String[] args) {
		int arr[]= {0,1,0,0,1,0};
		int n= arr.length;
		int narr[]= new int[n];
		for(int i=0;i<n;i++) {
			narr[i]=0;
		}
		int flag=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==0){
				flag++;
			}
		}
		for(int i=flag; i<n; i++) {
			narr[i]=1;
		}
		for(int i=0; i<n;i++) {
			System.out.println(narr[i]+" ");
		}
}
}
		