package WinterCamp;

public class lecture1c {
	public static void main( String[] args) {
		StringBuffer n= new StringBuffer("abcdefdzfkdgfdksgfuksdg");
		String abc= "newreplace";
	    n.reverse();
	    int m= n.length();
	    String ans1, ans2;
	    ans1= n.substring(0,4);
	    ans2= n.substring(10, m);
	    
	    System.out.println(ans1+ abc+ ans2);
		
		
	}
}
