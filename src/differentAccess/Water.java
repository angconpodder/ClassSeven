package differentAccess;

public class Water {
	public int a = 10;
	public static int b = 20;
	

	public static void testStatic(){
		System.out.println("testStatic");
	}
	
	public void testNonStatic(){
		System.out.println("testNonStatic");
	}
}
