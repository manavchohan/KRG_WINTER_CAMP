package WinterCamp;

import java.util.Scanner;

public class lecture3b {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String s1= sc.nextLine();
		s= s.concat(s1);
		for(int i=0; i<s.length(); i++)
		System.out.println(s.charAt(i));
	}
}

