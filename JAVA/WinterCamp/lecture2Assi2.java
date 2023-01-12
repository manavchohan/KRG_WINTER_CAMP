package WinterCamp;
 public class lecture2Assi2 implements Cloneable{
	int a;
	String name;
	lecture2Assi2(int a, String name) {
		this.a= a;
		this.name= name;
	}
	public static void main(String[] args) {
		lecture2Assi2 s1= new lecture2Assi2(1, "Manav");
		System.out.println(s1.a+ " "+ s1.name);
		try {
			lecture2Assi2 s2= (lecture2Assi2)s1.clone();
			System.out.println(s2.a+ " "+ s2.name);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
