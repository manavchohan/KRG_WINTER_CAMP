package WinterCamp;

public class lecture7a {
	public static void checkNum(int num) {
		if(num< 1) {
			throw new ArithmeticException(" Number is negative, can't calculate square");
		}
		else {
			System.out.println("Sqaure of "+ num + " is "+( num* num));
		}
	}
	public static void main(String[] args) {
		lecture7a obj = new lecture7a();
		try {
		obj.checkNum(-3);}
		catch(Exception e) {
			System.out.println("Exception: "+ e);
		}
		finally {
		System.out.println("Rest of the code");
		}
		
	}
}
