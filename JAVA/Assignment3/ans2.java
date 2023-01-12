package Assignment3;
import java.util.Scanner;
public class ans2 {
	void arrayrotation() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        if(k<0){
            
        k= (-1)*k;
        int a;
        int count=0;

        while(count<k){
            a= arr[0];
            count++;
            for(int i=0; i<n-1; i++){
                arr[i]= arr[i+1];
            }
            arr[n-1]= a;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        }else if(k>0){
        int a;
        int count = 0;

        while(count < k){
            a = arr[n - 1];
            count++;
            
        
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
        }
       
}
}
