package tests;

public class Test3 {
	static Test3 t5= new Test3();

	static Test1 t4 = new Test1();
	

	public static void main(String[] args) {

		circle();
		t5.square();
		
		Test1.printme();
		t4.testme();
		
		
	}
	
	public static void circle() {
		System.out.println("circle method");
	}
	
	public void square() {
		System.out.println("square method");
	}

}
