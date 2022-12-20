package Assignment1java;

import WinterCamp.lecture2Assi2;

public class ans implements Cloneable{
	public static void main(String[] args) {
//		Ans1
		ans1 obj1= new ans1();
		obj1.stringsort();
		
//		Ans2
		ans2 s1= new ans2(1, "Manav");
		System.out.println(s1.a+ " "+ s1.name);
		try {
			ans2 s2= (ans2)s1.clone();
			System.out.println(s2.a+ " "+ s2.name);
			System.out.println("End of ans2");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
//	    Ans3
		ans3 obj3= new ans3();
		obj3.nestedwhile();
		
//		Ans4
		ans4 obj4= new ans4();
		obj4.scans();
		
//		Ans5
		ans5 obj5= new ans5();
		obj5.printf();
		
//		Ans6
		ans6 obj6= new ans6();
		obj6.substr();
		
		}
	}

