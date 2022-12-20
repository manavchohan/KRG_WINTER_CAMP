package Assignment1java;

public class ans1 {
	void stringsort() {
		String str = "piyush";
		char arr[]= str.toCharArray();
	int i=0;
	char temp;
	while(i<arr.length) {
		int j= i+1;
		while(j< arr.length) {
			if(arr[i]< arr[j]) {
				temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				
			}
			j +=1;
		}
		i +=1;
	}
	int k = 0;
	while(k < arr.length) {
	System.out.println(arr[k]+" ");
	k++;}
	System.out.println("End of ans1");
}
}
