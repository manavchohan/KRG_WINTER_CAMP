package Assignment1java;

import java.util.Scanner;

public class ans6 {
	public void substr() {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		String ans= str.substring(a,b);
		System.out.println(ans);
		System.out.println("End of ans6");
	}
}
