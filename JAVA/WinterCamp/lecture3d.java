package WinterCamp;

import java.util.Scanner;

public class lecture3d {
	
	static void reverse(String s) throws ArrayIndexOutOfBoundsException {
		try{
			String sb[]= s.split(" ");
		
		for(int i=sb.length-1; i>=0; i--) {
			System.out.println(sb[i]+ " ");
		}
		}
		catch(Exception e) {
			System.out.println("Exception" + e);
		}
	}
	
	static void removewhitespace(String s) {
		String m= s.replaceAll(" ", "");
		System.out.println(m);
	}
	static void alphabeticalorder(String s) {
		char ans[] = s.toCharArray();
		for( int i= 0; i<ans.length-1; i++) {
				for(int j=0; j<ans.length-i-1; j++ ) {
					if( ans[j+1]>ans[j]) {
						char temp = ans[j+1];
						ans[j+1]= ans[j];
						ans[j]= temp;
					}
				}
			}
		
		for(int i=0; i<ans.length-1; i++) {
		System.out.println(ans[i]);
	}
	}
	
	
	public static void main(String[] args) {
		String s= "Hey I am fine";
		reverse(s);
		removewhitespace(s);
		alphabeticalorder(s);
	}
}