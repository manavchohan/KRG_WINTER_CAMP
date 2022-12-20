package Assignment1java;

public class ans2 implements Cloneable{
	int a;
	String name;
	ans2(int a, String name) {
		this.a= a;
		this.name= name;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}