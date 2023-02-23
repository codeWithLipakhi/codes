package practice_project;

public class c {

	 //  static m0() {} we can not declare a method only static but we can declare a method static with a return type
	
	
	static void M1() {
		System.out.println("static void M1() starts");
		//M2();
		int a =24;
		System.out.println("local variable 'a' of M1()'s value ="+a);
		System.out.println("static void M1() ends");
	}
	
	// public  M0() {} we can not declare a method only public but we can declare a method public with a return type
	
	public void m1() {
		System.out.println("public void m1() starts");
		M2();
		long f = 1324354999000967586l;
		System.out.println("local variable 'f' of m1()'s value ="+f);
		System.out.println("public void m1() ends");
		
	}
	 // but we can declare a method only void that is a return type
	void m2() {
		System.out.println(" void m2() starts");
		M2();
		float g=3.9f;
		//float h=3.2; not possible to assign a bigger value to smaller data type 
		System.out.println("local variable 'g' of m2()'s value ="+g);
		System.out.println(" void m2()ends");
	}
	// public static m0() {} we can not declare a method public static only and we can declare it with return type 
	// changing the keyword does not make any difference
	static public void m3() {
		System.out.println("static  public void m3() starts");
		//M2();
		String s="clear the output";
		System.out.println("local variable 's' of m3()'s value ="+s);
		System.out.println("static  public void m3() ends");
	}
	
	static void M2() {
		System.out.println("static void M2() starts");
		m3() ;
		byte b =127;
		System.out.println("local variable 'b' of M2()'s value ="+b);
		M1();
		System.out.println("static void M2() ends");
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("main() starts");
	int q=23;
	System.out.println("local variable 'q' of main()'s value ="+q);
	
	c c1 =new c();
	M1();
	c1.m1();
	c1.m2();
	m3();
	M2();
	System.out.println("main() ends");

	
	}

}
