package Assignment3;
import java.io.*;
public class ans1 {
	void sortarray() {
        int arr[] = {1,0,0,1,0,0,1,1,1,0};
        int a=0;
        int b=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                a++;
            }else{
                b++;
            }
        }
        for(int i=0; i<a; i++){
            arr[i]=0;
        }
        for(int i=a+1; i<b+a; i++){
            arr[i]=1;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
