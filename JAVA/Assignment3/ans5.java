package Assignment3;

public class ans5 {
	void mindistance() {
		int arr[] = { 2, 5, 1, 9 };
        int n = arr.length;
        int ind[] = new int[n];
        for (int j = 0; j < n; j++) {
            int temp = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (j == i) {
                    continue;
                }
                int val = Math.abs(arr[i]-arr[j]);

                if (val < temp) {
                    temp = val;
                }
            }
            ind[j] = temp;
            temp = 1000;
        }
        for(int i=0; i<n; i++){
        System.out.print(ind[i]);
        }
	}
}
