package WinterCamp;

public class lecture2Assi1 {
	public static void main(String[] args) {
		String str = "piyush";
		char arr[]= str.toCharArray();
		
		int i=0;
		while(i<arr.length) {
			int j= i+1;
			char temp;
			while(j< arr.length) {
				if(arr[i]< arr[j]) {
					temp= arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
					
				}
				j++;
			}
			i++;
		}
		int k = 0;
		while(k < arr.length) {
		System.out.println(arr[k]+" ");
		k++;}
	}
}
