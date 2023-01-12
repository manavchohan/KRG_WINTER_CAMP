package Assignment3;
import java.util.Arrays;
public class ans3 {
	void slarray() {
		int arr[] = {9,5,2,4,3,7,8};
        Arrays.sort(arr);
        int n = arr.length;

        System.out.println("Smallest no. is "+ arr[0]);
        System.out.println("Smallest no. is "+ arr[n-1]);
	}
}
