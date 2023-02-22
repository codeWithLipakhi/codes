package practice_project;

public class c {

	 //  static m0() {} 
	//we can not declare a method only static but we can declare a method static with a return type ,like M1() method below
	
	
	static void M1() {
		M2();
		int a =24;
		System.out.println("a="+a);
		
	}
	
	// public  M0() {} we can not declare a method only public 
	//but we can declare a method public with a return type , like m1() method below
	
	public void m1() {
		M2();
		long f = 1324354999000967586l;
		System.out.println("f="+f);
		
	}
	 // but we can declare a method only by void that is a return type
	void m2() {
		M2();
		float g=3.9f;
		//float h=3.2; not possible to assign a bigger value to smaller data type 
		System.out.println("g="+g);
	}
	// public static m0() {}. We can not declare a method using only public static keyword
	//but we can declare it with return type  like public static void m0()
	
	// changing the keyword does not make any difference
	static public void m3() {
		//M2();
		String s="clear the output";
		System.out.println("s="+s);
	}
	
	static void M2() {
		m3() ;
		byte b =127;
		System.out.println("b="+b);
		
	}
	
	
	
	
	public static void main(String[] args) {


	int q=23;
	System.out.println("q="+q);
	
	c c1 =new c();
	M1();
	c1.m1();
	c1.m2();
	m3();
	
	
	
	}

}
