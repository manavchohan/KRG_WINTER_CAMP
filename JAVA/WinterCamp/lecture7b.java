package WinterCamp;
// we can use throws keyword to delicate responsibilty of exception handling to the caller method. it may be another method or JVM is responsible to handle the exception. 


// In throw we are handling exception on our own.

public class lecture7b {
	public int divideNum(int num1, int num2) throws ArithmeticException{
		int div = num1/num2;
		return div;
	}
	public static void main(String[] args) {
		lecture7b obj= new lecture7b();
		try {
			System.out.println(obj.divideNum(45,0));
			}
		catch(ArithmeticException e) {
			System.out.println("Number cannt be divided");
		}
		
	}
}
