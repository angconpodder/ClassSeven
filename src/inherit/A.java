package inherit;

import java.util.Scanner;

public class A extends B {

	public static void main(String[] args) {
		
		
		
		A objA = new A();
		objA.getParentBS();
		
		
//		AS();
//		BS();
//		CS();
//		A.AS();
//		A.BS();
//		A.CS();
//		
//		B.BS();
//		C.CS();
//		
//		A objA = new A();
//		objA.ANS();
//		objA.BNS();
//		objA.CNS();
//		
//		B objB = new B();
//		objB.BNS();
//		objB.BS();
//		
//		C objC = new C();
//		objC.CNS();

	}
	
	public static void AS(){
		System.out.println("Static A");
	}
	
	public void ANS(){
		System.out.println("NON Static A");
	}
	
	public static void BS(){
		System.out.println("I am the only one. Static B");
	}
	
	public void getParentBS(){
		super.BS();
		super.BNS();
		
		System.out.println(super.a);
		System.out.println(super.b);
		
		
	}
	

}
