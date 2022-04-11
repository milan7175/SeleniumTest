package tests;

public class ArgumentsTest {

	public static void main(String[] args) {

		sum(15, 25);
		sum();
		sum(10,15,3);
		
		
	}
	
	public static void sum() {
		int a = 4+9;
		System.out.println(a);
	}

	public static void sum(int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	public static void sum(int p, int q, int r) {
		int a = p+q+r;
		System.out.println(a);
	}
}
