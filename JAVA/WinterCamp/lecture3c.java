package WinterCamp;

import java.util.Scanner;

public class lecture3c {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String s1= sc.nextLine();

		System.out.println(s.compareTo(s1));
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}

// for compareTo
// if S1> S2  === +ve
// s1= hello, s2= aello----> +ve
// if S1= S2 ==== 0
// Eg S1= Manav, S2= Manav
// Ans= 0
// if S1< S2 === -ve
// s1= hello, s2= Aello-----> -ve 

