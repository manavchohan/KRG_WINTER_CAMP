package Assignment3;
import java.util.Arrays;
public class ans4 {
	void secondlselement() {
		int arr[] = {9,5,2,4,3,7,8};
        Arrays.sort(arr);
        int n = arr.length;

        System.out.println("Smallest no. is "+ arr[2]);
        System.out.println("Smallest no. is "+ arr[n-2]);
	}
}
