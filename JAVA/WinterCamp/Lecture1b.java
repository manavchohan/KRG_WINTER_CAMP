package WinterCamp;

public class Lecture1b {

public static void main(String[] args) {
	StringBuffer n= new StringBuffer("abcdefdzfkdgfdksgfuksdg");
    n.reverse();
    int m= n.length();
    String ans1, ans2;
    ans1= n.substring(0,4);
    ans2= n.substring(10, m);
    
    System.out.println(ans1+ ans2);
}
}


//relace a substr inside a string with other str
