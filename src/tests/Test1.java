package tests;

import selenium.Test4;

public class Test1 {
	
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	
	
	

	public static void main(String[] args) {

		System.out.println("i am in main method");
		scanme();
		printme();
		System.out.println("after scan me");
		
		t1.testme();
		t1.useme();
		Test2.red();
		t2.blue();
		Test3.circle();
		t3.square();
		Test4.audi();
		t4.bmw();
		ArgumentsTest.sum(200, 400);
		
		
		
		
	}
	
	public static void printme() { // not main method though. output only will execute for main method
		System.out.println("printme");
		
	}
	 public static void scanme() {
		 System.out.println("scan me");
		 
	 }
	 public void testme() {
		 System.out.println("test me");
		 
	 }
	 
	 public void useme() {
		 System.out.println("use me");
		 
	 }

}
