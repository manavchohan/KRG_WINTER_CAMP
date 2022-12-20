package Assignment1java;

import java.util.Scanner;

public class ans5 {
	public void printf() {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		int a= sc.nextInt();

		System.out.printf("%-15s %0,3d", str, a+ " ");
		System.out.println("End of ans5");
	}
}
