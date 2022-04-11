package tests;

public class ArrayClassTest {

	public static void main(String[] args) {

		
		String tool = "seleniun";
		String tools[] = {"selenium", "java", "testng", "maven"};
		System.out.println(tools.length);
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		
		for(int i=0; i<tools.length; i++ ) {
			System.out.println(tools[i]);
		}
		
		
		
		int numbers[] = {10, 20, 400, 500};
		System.out.println(numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		Object mix[] = {"selenium", 123, "abd"};
		System.out.println(mix.length);
		System.out.println(mix[2]);
		
		
	}

}
