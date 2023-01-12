package WinterCamp;

public class lecture1a {
	static int number(String s) {
		int i=s.length();
		String n =s.replace("b", "");
		int f= n.length();
		f= i-f;
		return f;
	}

public static void main(String[] args) {
	String s= "aabcd";
	System.out.println(number(s));
}
}
