package access;

import differentAccess.Water;

public class AccessModifier{

	
	public static void main(String[] args) {
		
		Water w = new Water();
		
		System.out.println(w.a);
		System.out.println(w.b);
		
		w.testNonStatic();
		
		w.testStatic();

	}
	

}
