package Assignment1java;

public class ans3 {
	void nestedwhile() {
	int s = 0;
    int t = 1;
    int i = 0;
    while(i<10){
        s = s + i;
        int j = i;
        while(j>0){
            t = t * (j - i);
            j--;
        }
        i++;
        s = s * t;
        System.out.println("T is " + t);
    }
    System.out.println("S is " + s);
    System.out.println("End of ans3");
}
}
