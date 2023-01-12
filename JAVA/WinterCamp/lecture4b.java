package WinterCamp;

public class lecture4b {
	public static void main(String[] args) {
		String s= new String("Hello");
		String s1= new String("Hello");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		StringBuffer sb= new StringBuffer("Hello");
		StringBuffer sb1= new StringBuffer("Hello");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
			}
}
