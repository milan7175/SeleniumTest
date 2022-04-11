package tests;

public class IfStatementTest {

	public static void main(String[] args) {

		
		int a= 300;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is greater");
			
		}
		else {
			System.out.println("b is greater");
		}
		
		String expected = "selenium";
		String actual = "Selenium";
		
		if(expected.equals(actual)) {
			System.out.println("test pass");
			
		} else {
			System.out.println("test fail");
		}
		
	}
}

